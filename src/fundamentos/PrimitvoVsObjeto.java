package fundamentos;

public class PrimitvoVsObjeto {
    public static void main(String[] args) {
        String s = new String("texto");
        s.toUpperCase();

        //Wrappers são a versão objeto dos tipos primitvos!

        int a = 123;
        System.out.println(a);
    }
}
