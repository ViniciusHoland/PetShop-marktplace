package model;

import controllers.EstoqueController;

import java.util.ArrayList;


public class Venda {
	
	private Funcionario funcionario;
	private Cliente cliente;
	private ArrayList<ItemVenda> itensVenda;
	private ArrayList<ItemServico> itensservicos;
	private double totalProduto;
	private double totalServico;
	private boolean fechada;
	
	public Venda(Funcionario funcionario, Cliente cliente) {
		this.funcionario = funcionario;
		this.cliente = cliente;
		this.itensVenda = new ArrayList<ItemVenda>();
		this.itensservicos= new ArrayList<ItemServico>();
		this.fechada = false;
	
	}
	
	public Venda() {
		this.itensVenda = new ArrayList<ItemVenda>();
		this.itensservicos= new ArrayList<ItemServico>();
		this.fechada = false;
	}
	
	public void adicionarProdutoVenda(int idProduto,int quantidade) {
		if(this.fechada){
			System.out.println("venda já foi fechada, não é possivel adicionar mais itens");
			return;
		}
		Produto produto = EstoqueController.getInstancia().bucarProdutoNoEstoque(idProduto);
		ItemVenda novoItemVenda = new ItemVenda(produto, quantidade);
		itensVenda.add(novoItemVenda);
		this.totalProduto += novoItemVenda.getTotal(); // vai somando o total de produtos
	}
	
	public void adicionarServicoVenda(Servico servico, int quantidade) {
		ItemServico novoItemServico = new ItemServico(servico, quantidade);
		itensservicos.add(novoItemServico);
		this.totalServico += novoItemServico.getTotal();
	
	}
	
	public void detalharVenda() {
		
		for(ItemVenda item : itensVenda) {
			System.out.println(item.getProduto().getNomeProduto() +  " R$ " + item.getProduto().getPrecoProduto() + " x " + item.getQuantidade() + " = R$ "+ item.getTotal());
		}
		for(ItemServico servico : itensservicos) {
			System.out.println(servico.getServico().getNomeServico() + " R$ " + servico.getServico().getValorServico() + " x " + servico.getQuantidade() + " = R$ " + servico.getTotal());
		}
		double valortotal = this.totalProduto + this.totalServico;
		System.out.println("Valor Total R$ " + valortotal);
	}
	
	public void fecharVenda() {

		if(this.fechada){
			System.out.println("A venda já foi fechada");
		}
		fechada = true;

		//System.out.println("O cliente " + this.cliente.getNomeCliente() + " Realizou a compra");
		detalharVenda();
		System.out.println("Finalizando Venda...");
		//System.out.println("O funcionario " + this.funcionario.getNomeFuncionario() + " finalizou a venda");
	}


	public boolean isFechada() {
		return fechada;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<ItemVenda> getItensVenda() {
		return itensVenda;
	}

	public void setItensVenda(ArrayList<ItemVenda> itensVenda) {
		this.itensVenda = itensVenda;
	}

	public ArrayList<ItemServico> getItensservicos() {
		return itensservicos;
	}

	public void setItensservicos(ArrayList<ItemServico> itensservicos) {
		this.itensservicos = itensservicos;
	}

	public double getTotalProduto() {
		return totalProduto;
	}

	public void setTotalProduto(double totalProduto) {
		this.totalProduto = totalProduto;
	}

	public double getTotalServico() {
		return totalServico;
	}

	public void setTotalServico(double totalServico) {
		this.totalServico = totalServico;
	}
	
	
	
	
}
