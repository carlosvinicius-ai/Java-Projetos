import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int peca1, peca2, num1, num2;
        double valor1, valor2, valorFinal;

        System.out.print("Digite o código da peça, número de peças e valor, separados por espaço: ");
        peca1 = sc.nextInt();
        num1 = sc.nextInt();
        valor1 = sc.nextDouble();

        System.out.print("Digite o código da peça, número de peças e valor, separados por espaço: ");
        peca2 = sc.nextInt();
        num2 = sc.nextInt();
        valor2 = sc.nextDouble();

        valorFinal = (double) (num1 * valor1) + (double) (num2 * valor2);

        System.out.printf("VALOR A PAGAR: R$%.2f", valorFinal);
    }
}