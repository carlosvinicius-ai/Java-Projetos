import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number, hourWork;
        double hourSalary, salary;

        System.out.print("Digite seu número de cadastro: ");
        number = sc.nextInt();
        System.out.print("Digite as Horas que você trabalhou: ");
        hourWork = sc.nextInt();
        System.out.print("Digite seu salário por hora: ");
        hourSalary = sc.nextDouble();

        salary = (double) hourWork * hourSalary;

        System.out.printf("O usuário de número %d tem o salário de $%.2f", number, salary);
    }
}
