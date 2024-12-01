package modulos;

import controllers.ServicoController;

public class ModuloServico {

    private static ModuloServico instancia;

    private ModuloServico(){

    }
    public static ModuloServico getInstancia(){
        if(instancia == null){
            instancia = new ModuloServico();
        }

        ServicoController.getInstancia().cadastrarServico("tosa", 80.00);
        ServicoController.getInstancia().cadastrarServico("banho", 50.00);
        ServicoController.getInstancia().cadastrarServico("hidratação", 100.00);
        ServicoController.getInstancia().cadastrarServico("aplicação de antipulgas", 30.00);
        ServicoController.getInstancia().cadastrarServico("consulta veterinária", 150.00);


        return instancia;
    }
}
