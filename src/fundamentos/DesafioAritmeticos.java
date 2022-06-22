package fundamentos;

public class DesafioAritmeticos {
    public static void main(String[] args) {

       /* int a = 3 * 4 - 10;
        int b = (int) Math.pow(a, 3);
        System.out.println(b); */

        int a = 6 * (3+2);
        int b = (int )Math.pow(a, 2);
        System.out.println("a = " + a); //30
        System.out.println("b = "+  b); //900

        int c = b / (3 * 2);
        System.out.println("c = " + c); //150

        int d = (1 -5) * (2 - 7);
        System.out.println("d = " + d); //20

        int e = d / 2;
        System.out.println("e = " + e); //10

        int f = (int) Math.pow(e, 2);
        System.out.println("f = " + f); //100

        int g = (c - f);
        System.out.println("g = " + g); //50

        int h = (int) Math.pow(10,3);
        System.out.println("h = " + h); //1000

        int i = (int) Math.pow(50,3);
        System.out.println("i = " + i); //125000

        int j = (i / h);
        System.out.println("j = " + j); //125

        System.out.println("O resultado do desafio é = " + j);

    }
}
