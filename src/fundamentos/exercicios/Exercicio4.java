package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    //Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        double valor = scanner.nextDouble();
        double quadrado = Math.pow(valor, 2);
        double cubo = Math.pow(valor, 3);

        System.out.println("O valor ao quadrado é: " + quadrado + "\n O valor ao cubo é: " + cubo);
        scanner.close();
    }
}
