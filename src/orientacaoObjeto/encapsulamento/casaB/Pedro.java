package orientacaoObjeto.encapsulamento.casaB;

import orientacaoObjeto.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    void testeAcessos(){

        Ana mae = new Ana();

        //System.out.println(mae.segredo);
        //System.out.println(mae.facoDentroDeCasa);
        System.out.println(formaDeFalar); //só dá para acessar via herança
        System.out.println(mae.todosSabem);

    }

}
