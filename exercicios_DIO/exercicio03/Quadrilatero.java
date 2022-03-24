package exercicios_DIO.exercicio03;

public class Quadrilatero {

    //Exercicio para entender o funcionamento do return
    //nesse exercicio o que será mostrado no console é passado no Main

    public static double area(double lado) {

        return lado * lado;
    }

    public static double area(double lado1, double lado2) {

        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {

        return ((baseMaior+baseMenor)*altura) / 2;
    }

}
