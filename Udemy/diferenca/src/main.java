import java.util.Scanner;

public class main {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int a, b, c, d, difereca;

        System.out.print("Digite o Primeiro numero: ");
        a = sc.nextInt();
        System.out.print("Digite o Segundo numero: ");
        b = sc.nextInt();
        System.out.print("Digite o Terceiro numero: ");
        c = sc.nextInt();
        System.out.print("Digite o Quarto numero: ");
        d = sc.nextInt();

        difereca = (a*b) - (c*d);

        System.out.printf("A diferença é de %d", difereca);
    }

}
