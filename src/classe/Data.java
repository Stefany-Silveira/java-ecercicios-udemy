package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    String obterDataFormata(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }

    void imprimirDataFormatada(){
        System.out.println(obterDataFormata());
    }
}
