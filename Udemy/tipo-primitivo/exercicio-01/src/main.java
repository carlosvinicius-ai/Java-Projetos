//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x, y, soma;

        System.out.print("Digite o primeiro numero: ");
        x = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        y = sc.nextInt();

        soma = y + x;
        System.out.printf("A soma de %d com %d é igual a %d", x, y, soma);



        sc.close();
    }
}
