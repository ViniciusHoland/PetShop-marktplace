package model;

import java.util.ArrayList;
import java.util.List;

public class Servico {

	private int idServico;
	private String nomeServico;
	private double valorServico;
	private List<Servico> servicos = new ArrayList<>();
	private static int nextId=1;
	
	
	public Servico(String nomeServico, double valorServico) {
		super();
		this.idServico = nextId++;
		this.nomeServico = nomeServico;
		this.valorServico = valorServico;
	}

	public Servico() {

	}

	public void addServico(Servico servico){
		this.servicos.add(servico);
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

	public int getIdServico() {
		return idServico;
	}

	public void setIdServico(int idServico) {
		this.idServico = idServico;
	}
}
