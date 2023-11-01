package Ficha_4;
import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o primeiro número inteiro positivo:");
        int num1 = input.nextInt();
        System.out.println("Insira o segundo número inteiro positivo:");
        int num2 = input.nextInt();
        int resultado = 0;
        
        while(num1 <= 0 || num2 <= 0) {
        	System.out.println("Número inválido.\nInsira o primeiro número inteiro positivo:");
        	num1 = input.nextInt();
        	System.out.println("Insira o segundo número inteiro positivo:");
        	num2 = input.nextInt();
        }
        
        for(int i= 0; i < num2; i++) {
        	resultado += num1;
            System.out.printf("Resultado: %d + %d = %d\n",num1, i, resultado);
        }
        

	}

}
