import java.util.Scanner;

/**
 * Escreva um programa que repita a leitura de uma senha até que ela seja válida.
 * Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
 * Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido"
 * e o algoritmo encerrado. Considere que a senha correta é o valor 2002.*/


public class Senha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha = 2002;
        int teste;

        while(true) {
            System.out.print("Digite a senha: (Apenas número) ");
            teste = sc.nextInt();

            if (teste == senha) {
                System.out.println("Acesso Permitido");
                break;
            }

            System.out.println("Senha Invalida");
        }

        sc.close();
    }

}
