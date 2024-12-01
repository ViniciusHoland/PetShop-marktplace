package model;


public class ItemEstoque {
	
	private int id;
	private Produto produto;
	private int quantidade;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public ItemEstoque(int id, Produto produto, int quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
		this.id = id;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
}
