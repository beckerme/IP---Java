package Ficha_4;
import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero inteiro positivo: ");
		int numero = input.nextInt();
		
		for(int i = 2; i <= numero/2; i++) {
			if(numero % 2 == 0) {
				break;
			}
		}
		
		if(!(numero % 2 == 0)) {
			System.out.printf("%d é primo", numero);
		} else {
			System.out.printf("%d nao e primo", numero);
		}
	}

}
