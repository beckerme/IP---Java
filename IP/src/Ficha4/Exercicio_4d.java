package Ficha_4;
import java.util.Scanner;

public class Exercicio_4d {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		int num1;
//		do {
//			System.out.print("Numero 1: ");
//			num1 = input.nextInt();
//			int num = 5;
//			int soma = num1 + num;
//			System.out.printf("Resultado = %d\n", soma);
//		}while(num1 != 0);
		
		// será melhor? 
		int num = 5; 
		int soma = 0; 
		while( num != 0 ) { 
		System.out.printf("número? (zero termina)"); 
		num = input.nextInt(); 
		soma = soma+num; 
		System.out.printf("número? (zero termina)", soma); 
		}
		
	}

}
