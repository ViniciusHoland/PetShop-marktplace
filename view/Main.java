package view;

import controllers.EstoqueController;
import controllers.ProdutoController;
import controllers.VendaController;
import modulos.ModuloProduto;

public class Main {

    public static void main(String[] args) {

        // esse modulo automaticamente inicializa varios produtos para serem utilizados
        ModuloProduto.getInstancia();

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