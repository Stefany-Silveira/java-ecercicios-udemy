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

        System.out.println("A primeira data é: " + d1.dia + d1.mes + d1.ano);
        System.out.println("A segunda data é: " + d2.dia + d2.mes + d2.ano);

    }
}
