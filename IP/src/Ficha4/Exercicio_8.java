import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduza um nº inteiro positivo: ");
		int x = input.nextInt();
		System.out.println("Introduza um nº inteiro positivo: ");
		int y = input.nextInt();
		int potencia = 1;
		
		for(int i = 0; i < y; i++) {
			potencia *= x;
			
		}
		System.out.printf("%d", potencia);
	}

}
