package model;

public class ItemServico {
	
	private Servico servico;
	private int quantidade;
	
	
	public ItemServico(Servico servico, int quantidade) {
		this.servico = servico;
		this.quantidade = quantidade;
	}
	
	public Servico getServico() {
		return servico;
	}
	public int getQuantidade() {
		return quantidade;
	}
	
	public double getTotal() {
		return this.getServico().getValorServico() * this.getQuantidade();
	}
	
	
	
}
