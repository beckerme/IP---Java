package ficha4;
import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		System.out.print("Digite um numero: ");
		int numero = input.nextInt();
		
		for(int i = 0; i<numero; i++) {
			System.out.print("*");
		}
	}

}
