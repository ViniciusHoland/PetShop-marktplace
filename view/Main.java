package view;

import controllers.EstoqueController;
import controllers.ProdutoController;
import controllers.VendaController;

public class Main {

    public static void main(String[] args) {

        ProdutoController.getInstacia().cadastrarProduto("racao",5.5,10);
        ProdutoController.getInstacia().cadastrarProduto("pente",10.0,15);
        EstoqueController.getInstancia().mostrarProdutosQuantidades();

        VendaController.getInstancia().realizarVenda(1,5);

        EstoqueController.getInstancia().mostrarProdutosQuantidades();


    }
}