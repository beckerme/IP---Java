package Ficha_3;

public class Exercicio_4 {

	public static void main(String[] args) {
		int numero = 128;
		int restoDaDivisao = numero%2;
		
		if(restoDaDivisao == 0) {
			System.out.printf("O número %d é par", numero);
		} else {
			System.out.printf("O número %d é ímpar", numero);
		}

	}

}
