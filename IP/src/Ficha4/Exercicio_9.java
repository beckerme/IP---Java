package Ficha_4;
import java.util.Scanner;

public class Exercicio_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro não negativo: ");
        int numero = input.nextInt();
        
        int fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        
        System.out.println(numero + "! = " + fatorial);
	}

}
