package ficha4;
import java.util.Scanner;
public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		System.out.print("Digite um numero inteiro positivo: ");
		int numero = input.nextInt();
//		for(numero = 0; numero <= 5; numero++) {
//			System.out.printf("%d\n", numero);
//		}
		
		while(numero > 0) {
			System.out.printf("%d\n", numero);
			numero--;
		}

	}

}
