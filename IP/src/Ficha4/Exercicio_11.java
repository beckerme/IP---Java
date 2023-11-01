package Ficha_4;
import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numeroInserido = 0;
		do {
			System.out.println("\nInsira um número: ");
			numeroInserido = input.nextInt();
			
			for(int i = 0; i < numeroInserido; i++) {
				System.out.print("*");
			}
		}while(numeroInserido != 0);
	}

}
