package Revisão;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {


    Scanner leia = new Scanner(System.in);

    System.out.print("Digite um numero que voce quer a tabuada: ");
    int num = leia.nextInt();

    for ( int i =1; i <= 10; i+=1 ) {
        System.out.printf("%d x %d = %d\n", num, i, num*i);
    }
}
                }





