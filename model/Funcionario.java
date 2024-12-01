package model;

public class Funcionario {
	
	private String nomeFuncionario;
	private char sexo;
	private Estoque estoque;
	private Produto produto;
	
	public Funcionario(String nomeFuncionario, char sexo) {
		
		this.nomeFuncionario = nomeFuncionario;
		this.sexo = sexo;
		this.estoque = new Estoque();
		this.produto = new Produto();
	}
	
	

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void cadastrarProdutos(Produto produto, int quantidade) {
		
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	
	

}
