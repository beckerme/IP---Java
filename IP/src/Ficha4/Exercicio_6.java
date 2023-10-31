import java.util.Scanner;


public class Exercicio_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char numero;
		do {
			System.out.println("Insira um caracter: ");
			numero = input.next().charAt(0);
			
			if(numero >= 'a' && numero <= 'z' || numero >= 'A' && numero <= 'Z') {
				System.out.println(numero);
			}
		}while(numero != '.');
	}

}
