package Revisão;

import java.util.Scanner;

public class Enquanto {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        String continuar = "S";

        do {
            System.out.println("Ola mundo!");

            System.out.println("Quer continuar: ");
            continuar = leia.nextLine();

        } while ( continuar.equalsIgnoreCase("S"));
    }
}