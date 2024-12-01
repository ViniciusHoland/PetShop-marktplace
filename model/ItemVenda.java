package model;

public class ItemVenda {
	
	private Produto produto;
	private int quantidade;
	
	public ItemVenda(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public Produto getProduto() {
		return produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getTotal() {
		return this.getProduto().getPrecoProduto() * this.getQuantidade();
	}

	
	
	
	
	
}
