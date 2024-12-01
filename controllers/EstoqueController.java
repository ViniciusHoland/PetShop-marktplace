package controllers;

import model.Estoque;
import model.Produto;

public class EstoqueController {

	private static EstoqueController instancia;
	private Estoque estoque;
	
	private EstoqueController() {
		this.estoque = new Estoque();
	}

	public static EstoqueController getInstancia(){
		if(instancia == null){
			instancia = new EstoqueController();
		}
		return instancia;
	}


	public void adicionarProdutoAoEstoque(Produto produto, int quantidade) {
		
		this.estoque.cadastraEstoqueProduto(produto, quantidade);
	}
	
	public void removerProdutoEstoque(String nomeProduto, Integer quantidade) {
		this.estoque.removeProduto(nomeProduto, quantidade);
	}
	
	public Produto bucarProdutoNoEstoque(String nome) {
		Produto produtoNoEstoqueProduto = this.estoque.buscarProduto(nome);
		return produtoNoEstoqueProduto;
	}
	
	public void mostrarProdutosQuantidades() {
		this.estoque.listarProdutosEstoque();
	}
	
}
