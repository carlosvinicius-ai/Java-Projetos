package exercicios_DIO.exercicio01;

public class Calculadora {

    // Metodo de soma

    public static void soma(double numero1, double numero2) {

        double resultado = numero1 + numero2;  //para calcular o resultado onde o valor nele é alterado em cada metodo

        System.out.println("A soma de " + numero1 + " mais " + numero2 + " é " + resultado);
    }

    // metodo subtração

    public static void subtracao(double numero1, double numero2) {

        double resultado = numero1 - numero2;

        System.out.println("A subtracao de " + numero1 + " menos " + numero2 + " é " + resultado);
    }

    //metodo multiplicação

    public static void multiplicacao(double numero1, double numero2) {

        double resultado = numero1 * numero2;

        System.out.println("A multiplicação de " + numero1 + " vezes " + numero2 + " é " + resultado);
    }

    // metodo divisao

    public static void  divisao(double numero1, double numero2) {

        double resultado = numero1 / numero2;

        System.out.println("A divisão de " + numero1 + " por " + numero2 + " é " + resultado);
    }

}
