import java.util.Scanner;

public class main {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double raio, pi, area;
        pi = 3.14159;
        System.out.println("Digite o raio do circulo: ");
        raio = sc.nextDouble();

        area = pi * (raio * raio);

        System.out.printf("A areá é igual a %.4f", area);

        sc.close();
    }

}
