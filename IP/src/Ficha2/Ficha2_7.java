package Ficha_IP;

public class Ficha2_7 {

	public static void main(String[] args) {
		int segundos = 70661;
		int calculoDeConversaoHora = segundos/3600;
		int calculoDeConversaoMinutos = (segundos%3600) / 60;
		int segundosRestantes = (segundos%3600) % 60;
		
		System.out.printf("%02d:%02d:%02d", calculoDeConversaoHora, calculoDeConversaoMinutos, segundosRestantes);


	}

}
