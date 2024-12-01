package controllers;

import model.Servico;

import java.util.ArrayList;
import java.util.List;

public class ServicoController {

    private static ServicoController instancia;
    private List<Servico> servicos;

    private ServicoController(){
        this.servicos = new ArrayList<>();
    }

    public static ServicoController getInstancia(){

        if(instancia == null){
            instancia = new ServicoController();
        }
        return instancia;
    }


    public Servico cadastrarServico(String nome, double preco){

        Servico novoServico = new Servico(nome,preco);
        servicos.add(novoServico);

        return novoServico;

    }

    public void listarServicos(){
        System.out.println("Lista de servicos");
        for(Servico list : this.servicos){
            System.out.println("Id " + list.getIdServico() +  " - " + list.getNomeServico() + " - R$ " + list.getValorServico());
        }
    }

}
