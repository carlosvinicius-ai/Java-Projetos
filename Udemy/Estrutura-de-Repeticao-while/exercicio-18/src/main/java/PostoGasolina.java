import java.util.Scanner;

/**
 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
 * um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
 * 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
 * que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
 * exemplo.*/

public class PostoGasolina {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcool = 0, gasolina = 0, disel = 0, escolha;

        while (true) {

            System.out.print("Digite sua escolha: ");
            escolha = sc.nextInt();

            switch (escolha){

                case 1:
                    alcool ++;
                    break;

                case 2:
                    gasolina ++;
                    break;

                case 3:
                    disel ++;
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Escolha inválida");

            }

            if (escolha == 4) {
                break;
            }

        }

        System.out.printf("Alcool: %d%nGasolina: %d%nDiesel: %d%n",alcool, gasolina, disel);

    }

}
