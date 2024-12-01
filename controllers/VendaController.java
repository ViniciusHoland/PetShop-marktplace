package controllers;

import model.Cliente;
import model.Funcionario;
import model.ItemVenda;
import model.Produto;
import model.Servico;
import model.Venda;

public class VendaController {

	private Venda venda;
	
	public VendaController() {
		
	}

	public VendaController(Funcionario funcionario, Cliente cliente) {
		this.venda = new Venda(funcionario, cliente);
	}
	
	public void realizarVenda(Produto produto, int quantidade) {
		this.venda.adicionarProdutoVenda(produto, quantidade);
	}
	
	public void realizarVenda(Servico servico, int quantidade) {
		this.venda.adicionarServicoVenda(servico, quantidade);
	}
	
	
	public void detalharVenda() {
		this.venda.detalharVenda();
	}
	
	public void fecharVenda() {
		
		for(ItemVenda  itensDaVenda : this.venda.getItensVenda() ) {
			EstoqueController.getInstancia().removerProdutoEstoque(itensDaVenda.getProduto().getNomeProduto(), itensDaVenda.getQuantidade());
		}
	
		this.venda.fecharVenda();
	}
	
}
