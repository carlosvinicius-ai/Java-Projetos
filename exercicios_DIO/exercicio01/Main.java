package exercicios_DIO.exercicio01;
import java.util.Scanner;   // importar o metodo para poder pegar a informação doq está escito

public class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner (System.in); //criar o scanner no metodo
    
            // Calculadora
            System.out.println("Exercício calculadora\n" + "===================");
            
            System.out.println("Entre com o primeiro valor: ");
            double numero1 = scanner.nextDouble(); // passar para o scanner a informção

            System.out.println("Entre com o segundo valor: ");
            double numero2 = scanner.nextDouble();


            Calculadora.soma(numero1, numero2); //utilizar o valor passado pelo scanner
            Calculadora.subtracao(numero1, numero2);
            Calculadora.multiplicacao(numero1, numero2);
            Calculadora.divisao(numero1, numero2);
    
            // Mensagem



            System.out.println("Exercício mensagem \n" + "===================");

            System.out.println("Que horas são?");
            int hora = scanner.nextInt();

            Mensagem.obterMensagem(hora);
    
            // Empréstimo
            System.out.println("Exercício empréstimo \n" + "================");

            System.out.println("Insira o valor que deseja fazer o empréstimo: ");
            double valor = scanner.nextDouble();

            System.out.println("Quantas Parcelas: ");
            int parcelas = scanner.nextInt();

            Emprestimo.calcular(valor, parcelas);
    

            scanner.close();
        }
    

}
