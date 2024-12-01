package model;

import java.util.ArrayList;

public class Estoque {
	
	private ArrayList<ItemEstoque> itensProdutosEstoque;
	
	
	public Estoque() {
		itensProdutosEstoque =  new ArrayList<ItemEstoque>();
	}
	
	// cadastra produtos
	public void cadastraEstoqueProduto(Produto produto, int quantidade) {
		ItemEstoque itemEstoque = new ItemEstoque(produto.getIdProduto() ,produto, quantidade);
		
		itensProdutosEstoque.add(itemEstoque);
	}
	
	public void listarProdutosEstoque() {
		System.out.println("Lista dos Produtos");
		
		if(itensProdutosEstoque.isEmpty()) {
			System.out.println("O estoque está vazio");
			return;
		}
		
		for(ItemEstoque produtoNoEstoque : itensProdutosEstoque) {
			
			System.out.println("Id " + produtoNoEstoque.getId() + " - "  + produtoNoEstoque.getProduto().getNomeProduto()+  " - Quant " + produtoNoEstoque.getQuantidade());
		}
	}
	
	public Produto buscarProduto(String nome) {
		boolean encontrado = false;
		
		for(ItemEstoque produtosNoEstoque : itensProdutosEstoque) {
			Produto produto = produtosNoEstoque.getProduto();
			if(produto.getNomeProduto().equalsIgnoreCase(nome)) {
				encontrado = true;
				return produto;
			}
		}
		if(!encontrado) {
			System.out.println("Produto não encontrado " + nome);
		}
		return null;
	}
	
	
	public void removeProduto(String nomeProduto, Integer quantidade) {
		
		for(ItemEstoque produtosNoEstoque : itensProdutosEstoque) {
			Produto produto = produtosNoEstoque.getProduto();
			if(produto.getNomeProduto().equalsIgnoreCase(nomeProduto)) {
				produtosNoEstoque.setQuantidade(produtosNoEstoque.getQuantidade() - quantidade);
			}
		}
		
	}

	
	
}
