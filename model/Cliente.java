package model;

public class Cliente {
	
	private String nomeCliente;
	private String cpfCliente;
	private Pet petDoCliente;
	
	
	public Cliente(String nomeCliente, String cpfCliente, Pet petDoCliente) {
		super();
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.petDoCliente = petDoCliente;
	}
	
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public Pet getPetDoCliente() {
		return petDoCliente;
	}
	public void setPetDoCliente(Pet petDoCliente) {
		this.petDoCliente = petDoCliente;
	}
	
	
	
}
