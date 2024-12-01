package modulos;

import controllers.ProdutoController;

public class ModuloProduto {

    private static ModuloProduto instancia;

    private ModuloProduto(){

    }

    public static ModuloProduto getInstancia(){
        if(instancia == null){
            instancia = new ModuloProduto();
        }

        ProdutoController.getInstacia().cadastrarProduto("racao",5.5,20);
        ProdutoController.getInstacia().cadastrarProduto("pente",10.0,15);
        ProdutoController.getInstacia().cadastrarProduto("shampoo", 25.0, 10);
        ProdutoController.getInstacia().cadastrarProduto("coleira", 40.0, 5);
        ProdutoController.getInstacia().cadastrarProduto("brinquedo", 15.0, 20);
        ProdutoController.getInstacia().cadastrarProduto("comida enlatada", 8.5, 30);
        ProdutoController.getInstacia().cadastrarProduto("tapete higiênico", 50.0, 12);

        return instancia;
    }

}
