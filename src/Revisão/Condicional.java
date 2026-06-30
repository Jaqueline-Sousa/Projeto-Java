package Revisão;

import java.util.Scanner;

public class Condicional {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        //leia.useLocale(Locale.US);

        System.out.println("Digite uma altura em metros: ");
        double altura = leia.nextDouble();

        System.out.println("Digite um peso:");
        double peso = leia.nextDouble();

        System.out.printf("O peso é = %.2f e a altura é = %.2f ", peso, altura);

        double imc = peso / Math.pow(altura, 2);  // altura * altura -> potencia

        System.out.println(imc);

    if ( imc < 18.5){
        System.out.println("Abaixo do Peso");

    } else if (imc >= 18.5 & imc <= 25) {
        System.out.println("Peso Ideal (Parabéns)**");
    } else if ( imc >= 25 & imc < 30){
        System.out.println("** Levemnete acima do Peso**");
    } else if (imc >=30 & imc < 35){
        System.out.println("**Obesidade Severa/ Mórbida**");
    }


    }

}
