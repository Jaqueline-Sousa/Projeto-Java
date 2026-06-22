import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String nome;
       int idade;

        System.out.println("Digite o seu nome: ");
        nome = leia.nextLine();

        System.out.println("Digite a sua idade: ");
        idade = Integer.parseInt(leia.nextLine()); // Convertendo de string para inteiro.

        System.out.println("Esse é o "+nome+" e ele tem "+idade+" anos");
        System.out.printf("Esse é o %s e ele tem %d anos", nome,idade);

    }
}