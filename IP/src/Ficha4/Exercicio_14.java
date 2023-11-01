package Ficha_4;
import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o primeiro número inteiro positivo:");
        int num1 = input.nextInt();
        System.out.println("Insira o segundo número inteiro positivo:");
        int num2 = input.nextInt();
        int resultado = 0;
        
        if(num1 <= 0 || num2 <= 0) {
        	System.out.println("Número inválido.\nInsira o primeiro número inteiro positivo:");
        	num1 = input.nextInt();
        	System.out.println("Insira o segundo número inteiro positivo:");
        	num2 = input.nextInt();
        }
        
        while(num1 >= num2) {
        	num1 -= num2;
        	resultado++;
        }
    	System.out.printf("Resultado= %d", resultado);
	}

}
