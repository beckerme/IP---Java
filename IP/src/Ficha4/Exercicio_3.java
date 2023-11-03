package ficha4;
import java.util.Scanner;
public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		System.out.print("Escreva um numero: ");
		int numero = input.nextInt();
		
//		while(numero != 0) {
//			int absoluto = numero < 0 ? -numero : numero;
//			System.out.printf("Valor absoluto de |%d| = %d\n", absoluto, numero);
//			System.out.print("Por favor, insira um numero diferente de zero: ");
//			numero = input.nextInt();
//		}
		
		do {
			int absoluto = numero < 0 ? -numero : numero;
			System.out.printf("Valor absoluto de |%d| = %d\n", absoluto, numero);
			System.out.print("Por favor, insira um numero diferente de zero: ");
			numero = input.nextInt();
		}while(numero != 0);

	}

}
