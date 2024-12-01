package model;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	
	private Integer idProduto;
	private String nomeProduto;
	private double precoProduto;
	private int quantidadeEstoque;
	private List<Produto> produtos = new ArrayList<>();
	private static int nextId=1;
	
	
	public Produto(String nomeProduto, double precoProduto) {
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.idProduto = nextId++;
		//this.estoque = estoque.adicionarProduto();
	}
	
	public Produto(){
		
	}
	
	public Produto cadastrarProduto(Produto produto) {

		this.produtos.add(produto);
		return produto;

	}
	
	
	
	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}


	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}


	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public double getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}
