/**
 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
 * "Sao Multiplos" ou "Nao sao Multiplos",
 * indicando se os valores lidos são múltiplos entre si.
 * Atenção: os números devem poder ser digitados em
 * ordem crescente ou decrescente.
 */

import java.util.Scanner;

public class Divisiveis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B;

        System.out.print("Digite o primeiro número: ");
        A = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0){
            System.out.println("São Divisiveis");
        } else {
            System.out.println("Não São Divisiveis");
        }

    }

}
