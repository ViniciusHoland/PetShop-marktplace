package controllers;

import model.Produto;

public class ProdutoController {

	private static ProdutoController instacia;
	
	private ProdutoController() {
		
	}

	public static ProdutoController getInstacia(){

		if(instacia == null){
			instacia = new ProdutoController();
		}

		return instacia;

	}
	
	public boolean cadastrarProduto(String nomeProduto, double precoProduto, int quantidade) {
		Produto produto = new Produto(nomeProduto, precoProduto);
		produto.cadastrarProduto(produto);
		
		EstoqueController.getInstancia().adicionarProdutoAoEstoque(produto, quantidade);
		
		return true;
	}
	
	//public Produto buscarProduto(String nome) {}
	
	
}
