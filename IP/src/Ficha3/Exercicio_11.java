package ficha3Exercicios;
import java.util.Scanner;
public class Exercicio_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Introduza um dia: \n");
		System.out.print("Introduza um mes: \n");
		System.out.print("Introduza um ano: \n");
		String dia = input.next(), mes = input.next(), ano = input.next();
		
		switch(mes) {
			case "1":
				System.out.printf("A data é: %s de Janeiro de %s", dia, ano);
				break;
			case "2":
				System.out.printf("A data é: %s de Fevereiro de %s", dia, ano);
				break;
		}
	}

}
