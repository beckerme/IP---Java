package Ficha_3;

public class Exercicio_5 {

	public static void main(String[] args) {
		double numero = -81;
		
		if(numero >= 0) {
			double raizNumero = Math.sqrt(numero);
			System.out.printf("√%.1f = %.1f", numero, raizNumero);
		} else {
			double raizNegativa = Math.sqrt(Math.abs(numero));
			System.out.printf("√%.1f = %.1fi", numero, raizNegativa);
		}
	}

}
