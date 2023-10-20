package ficha3Exercicios;
import java.util.Scanner;

public class Exercicio_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Introduza uma cilindrada: ");
		int cilindrada = input.nextInt();
		double calcularImposto = 0;
		
		if(cilindrada > 1250) {
			calcularImposto = (cilindrada * 8.86) - 8813.22;
			System.out.printf("O Imposto Automóvel é de %.2f€", calcularImposto);
		}
		calcularImposto = (cilindrada * 3.74) - 2417.56;
		System.out.printf("O Imposto Automóvel é de %.2f€", calcularImposto);
	}

}
