/**
 * Com base na tabela abaixo, escreva um programa que leia o código de um item
 * e a quantidade deste item. A seguir,
 * calcule e mostre o valor da conta a pagar.*/

import java.util.Scanner;

public class Compra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double valor;
        String leftAlignFormat = "| %-6d | %-20s | %-5.2f |%n";

        System.out.format("+--------+----------------------+-------+%n");
        System.out.format("| Código | Especificação        | Preço |%n");
        System.out.format("+--------+----------------------+-------+%n");
        System.out.format(leftAlignFormat, 1, "Cachorro Quente", 4.00);
        System.out.format(leftAlignFormat, 2, "X-Salada", 4.50);
        System.out.format(leftAlignFormat, 3, "X-Bacon", 5.00);
        System.out.format(leftAlignFormat, 4, "Torrada Simples", 2.00);
        System.out.format(leftAlignFormat, 5, "Refrigerante", 1.50);
        System.out.format("+--------+----------------------+-------+%n");


        System.out.print("Digite o código: ");
        codigo = sc.nextInt();
        System.out.print("Digite a quantidade: ");
        quantidade = sc.nextInt();

        switch (codigo){
            case 1:
                valor = 4.00 * quantidade;
                break;

            case 2:
                valor = 4.50 * quantidade;
                break;

            case 3:
                valor = 5.00 * quantidade;
                break;

            case 4:
                valor = 2 * quantidade;
                break;

            case 5:
                valor = 1.50 * quantidade;
                break;

            default:
                valor = 0.0;
                break;
        }

        System.out.printf("TOTAL A PAGAR: R$%.2f",valor);

        sc.close();

    }

}
