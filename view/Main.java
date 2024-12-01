package view;

import controllers.EstoqueController;
import controllers.ProdutoController;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        ProdutoController.getInstacia().cadastrarProduto("racao",5.5,10);
        ProdutoController.getInstacia().cadastrarProduto("pente",10.0,15);

        EstoqueController.getInstancia().mostrarProdutosQuantidades();




    }
}