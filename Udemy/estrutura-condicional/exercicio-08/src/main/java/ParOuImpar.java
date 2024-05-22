
/**
 * Fazer um programa para ler um número inteiro e
 * dizer se este número é par ou ímpar*/

import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Digite um numero: ");
        numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }

}
