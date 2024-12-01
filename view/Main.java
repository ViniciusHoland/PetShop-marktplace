package view;

import controllers.EstoqueController;
import controllers.ProdutoController;
import controllers.VendaController;

public class Main {

    public static void main(String[] args) {

        ProdutoController.getInstacia().cadastrarProduto("racao",5.5,20);
        ProdutoController.getInstacia().cadastrarProduto("pente",10.0,15);
        EstoqueController.getInstancia().mostrarProdutosQuantidades();
        System.out.println();

        VendaController.getInstancia().iniciarVenda();
        VendaController.getInstancia().adicionarItensVenda(1,5);
        VendaController.getInstancia().adicionarItensVenda(2,3);
        VendaController.getInstancia().fecharVenda();
        System.out.println();

        VendaController.getInstancia().iniciarVenda();
        VendaController.getInstancia().adicionarItensVenda(2,4);
        VendaController.getInstancia().adicionarItensVenda(1,10);
        VendaController.getInstancia().fecharVenda();


        System.out.println();
        EstoqueController.getInstancia().mostrarProdutosQuantidades();


    }
}