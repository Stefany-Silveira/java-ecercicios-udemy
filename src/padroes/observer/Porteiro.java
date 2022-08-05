package padroes.observer;

import generics.ListaUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

    private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();

    public void registrarObservador(ObservadorChegadaAniversariante observador) {
        observadores.add(observador);
    }

    public void monitorar() {
        Scanner entrada = new Scanner(System.in);

        String valor = "";

        while(!"sair".equalsIgnoreCase(valor)) {

            System.out.print("Aniversariante chegou? ");
            valor = entrada.nextLine();

            if ("sim".equalsIgnoreCase(valor)) {
                //Criar o eventro
                EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());

                //notificar os observaodres!
                observadores.stream()
                        .forEach(o -> o.chegou(evento));
                valor = "sair" ;
                } else {
                System.out.println("Alarme falso!");
            }
        }

        entrada.close();
    }
}
