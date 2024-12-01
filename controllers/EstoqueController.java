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
	
	public void removerProdutoEstoque(int idProduto, Integer quantidade) {
		this.estoque.removeProduto(idProduto, quantidade);
	}
	
	public Produto bucarProdutoNoEstoque(int idProduto) {
		Produto produtoNoEstoqueProduto = this.estoque.buscarProduto(idProduto);
		return produtoNoEstoqueProduto;
	}
	
	public void mostrarProdutosQuantidades() {
		this.estoque.listarProdutosEstoque();
	}
	
}
