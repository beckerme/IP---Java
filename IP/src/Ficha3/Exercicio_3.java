package Ficha_3;

public class Exercicio_3 {

	public static void main(String[] args) {
		int primeiroNumero = 2;
		int segundoNumero = 10;
		
		if(primeiroNumero < segundoNumero) {
			primeiroNumero = 10;
			segundoNumero = 5;
			
			System.out.printf("Os numeros foram trocados.\nNº1= %d e Nº2= %d\n", primeiroNumero, segundoNumero);
		} else {
			System.out.printf("Nº1 = %d e Nº2 = %d", primeiroNumero, segundoNumero);	
		}

	}

}
