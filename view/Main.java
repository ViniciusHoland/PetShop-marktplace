package view;

import controllers.EstoqueController;
import controllers.ProdutoController;
import controllers.ServicoController;
import controllers.VendaController;
import modulos.ModuloProduto;
import modulos.ModuloServico;

public class Main {

    public static void main(String[] args) {

        // esse modulo automaticamente inicializa varios produtos para serem utilizados
        ModuloProduto.getInstancia();
        ModuloServico.getInstancia();

        EstoqueController.getInstancia().mostrarProdutosQuantidades();
        System.out.println();

        VendaController.getInstancia().iniciarVenda();
        VendaController.getInstancia().adicionarItensVenda(1,5);
        VendaController.getInstancia().adicionarItensVenda(2,3);
        VendaController.getInstancia().fecharVenda();
        System.out.println();

        //EstoqueController.getInstancia().mostrarProdutosQuantidades();

        ServicoController.getInstancia().listarServicos();


    }
}