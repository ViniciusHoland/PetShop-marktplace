package controllers;

import model.Cliente;
import model.Funcionario;
import model.ItemVenda;
import model.Produto;
import model.Servico;
import model.Venda;

public class VendaController {

	private  static VendaController instancia;
	private Venda vendaAtual;
	
	private VendaController() {
		
	}

	public static VendaController getInstancia(){
		if(instancia == null){
			instancia = new VendaController();
		}
		return instancia;
	}

	public void iniciarVenda(){
		if(vendaAtual != null && !vendaAtual.isFechada()){
			System.out.println("já existe uma venda em andamento. Finalize a venda atual");
		}
		this.vendaAtual = new Venda();
		System.out.println("Nova venda iniciada");
	}

	public Venda adicionarItensVenda(int idProduto, int quantidade) {

		this.vendaAtual.adicionarProdutoVenda(idProduto, quantidade);

		return vendaAtual;
	}
	
	public void adicionarItensVenda(Servico servico, int quantidade) {

	}


	public void detalharVenda(Venda venda) {
		venda.detalharVenda();
	}
	
	public void fecharVenda() {
		var venda = this.vendaAtual;
		for(ItemVenda  itensDaVenda : venda.getItensVenda() ) {
			EstoqueController.getInstancia().removerProdutoEstoque(itensDaVenda.getProduto().getIdProduto(), itensDaVenda.getQuantidade());
		}
		this.vendaAtual = null;
		venda.fecharVenda();
	}
	
}
