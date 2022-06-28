package classe;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();
        d1.dia = 21;
        d1.mes = 10;
        d1.ano = 2000;

        Data d2 = new Data();
        d2.dia = 15;
        d2.mes = 07;
        d2.ano = 1992;

        String dataFormatada1 = d1.obterDataFormata();

        System.out.println(dataFormatada1);
        System.out.println(d2.obterDataFormata());

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();
    }
}
