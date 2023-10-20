package ficha3Exercicios;
import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Introduza o salário: ");
		double salario = input.nextDouble();
		double taxa = 0;
		
		if(salario >= 0 && salario < 500) {
			System.out.printf("O valor do salário líquido é %.2f e não foi retido nenhum montante", salario);
		} else if(salario >= 500 && salario < 650 ) {
			taxa = (salario * 0.015);
			salario -= taxa;
			System.out.printf("O valor do salário líquido é de %.2f€ e o montante a reter é de %.2f€", salario, taxa);
		} else if(salario >= 650 && salario < 800 ) {
			taxa = (salario * 0.035);
			salario -= taxa;
			System.out.printf("O valor do salário líquido é de %.2f€ e o montante a reter é de %.2f€", salario, taxa);
		} else if(salario >= 800 && salario < 1200 ) {
			taxa = (salario * 0.05);
			salario -= taxa;
			System.out.printf("O valor do salário líquido é de %.2f€ e o montante a reter é de %.2f€", salario, taxa);
		} else if(salario >= 1200 && salario < 2000 ) {
			taxa = (salario * 0.10);
			salario -= taxa;
			System.out.printf("O valor do salário líquido é de %.2f€ e o montante a reter é de %.2f€", salario, taxa);
		} else if(salario >= 2000 && salario < 3000 ) {
			taxa = (salario * 0.20);
			salario -= taxa;
			System.out.printf("O valor do salário líquido é de %.2f€ e o montante a reter é de %.2f€", salario, taxa);
		} else if(salario >= 3000 ) {
			taxa = (salario * 0.35);
			salario -= taxa;
			System.out.printf("O valor do salário líquido é de %.2f€ e o montante a reter é de %.2f€", salario, taxa);
		} 
	}

}
