package model;

public class Servico {
	
	private String nomeServico;
	private double valorServico;
	
	
	public Servico(String nomeServico, double valorServico) {
		super();
		this.nomeServico = nomeServico;
		this.valorServico = valorServico;
	}

	public Servico() {

	}

	public String getNomeServico() {
		return nomeServico;
	}
	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}
	public double getValorServico() {
		return valorServico;
	}
	public void setValorServico(double valorServico) {
		this.valorServico = valorServico;
	}
	
	
}
