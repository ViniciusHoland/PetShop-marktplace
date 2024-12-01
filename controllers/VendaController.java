package controllers;

import model.Cliente;
import model.Funcionario;
import model.ItemVenda;
import model.Produto;
import model.Servico;
import model.Venda;

public class VendaController {

	private  static VendaController instancia;
	
	private VendaController() {
		
	}

	public static VendaController getInstancia(){
		if(instancia == null){
			instancia = new VendaController();
		}
		return instancia;
	}

	public Venda realizarVenda(int idProduto, int quantidade) {

		Venda novaVenda = new Venda();
		novaVenda.adicionarProdutoVenda(idProduto, quantidade);

		EstoqueController.getInstancia().removerProdutoEstoque(idProduto,quantidade);
		novaVenda.detalharVenda();
		return novaVenda;
	}
	
	public void realizarVenda(Servico servico, int quantidade) {
		Venda novaVenda = new Venda();
		novaVenda.adicionarServicoVenda(servico, quantidade);
	}


	public void detalharVenda(Venda venda) {
		venda.detalharVenda();
	}
	
	public void fecharVenda(Venda venda) {
		
		for(ItemVenda  itensDaVenda : venda.getItensVenda() ) {
			EstoqueController.getInstancia().removerProdutoEstoque(itensDaVenda.getProduto().getIdProduto(), itensDaVenda.getQuantidade());
		}
	
		venda.fecharVenda();
	}
	
}
