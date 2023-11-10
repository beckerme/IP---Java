package ficha_5;

public class Exercicio_4 {

	public static void main(String[] args) {
		double []temperaturaMedia = {2.9, 28.6, 8.1, 22.4, 27.7, 26.1, 5.5, 13.1, 24.7, 25.7,
				11.3, 1.6, 12.8, 27.6, 12.9, 23.1, 8.7, 16.4, 15.2, 6.8, 10, 26, 22, 28, 22, 
				20, 21, 10, 16, 5, 22, 22, 13, 5, 16, 17, 6, 4, 11, 27};
		double TempMax = temperaturaMedia[0];
		double TempMin = temperaturaMedia[0];
		int diaMaximo = 0, diaMinimo = 0;
		double soma = 0, media = 0;
		
		for(int i = 0; i < temperaturaMedia.length; i++) {
			soma = (int) (soma + temperaturaMedia[i]);
			media = soma /temperaturaMedia.length;
			if(temperaturaMedia[i] > TempMax) {
				TempMax = temperaturaMedia[i];
				diaMaximo = i;
			}
			
			if(temperaturaMedia[i] < TempMin) {
				TempMin = temperaturaMedia[i];
				diaMinimo = i;
				
			}
		}
		
		System.out.printf("Dia maximo: %d\nTemperatura maxima: %.1fºC"
				+ "\nDia minimo: %d\nTemperatura minima: %.1fºC\nA média do mes de agosto é: %.1f", diaMaximo+1, TempMax, diaMinimo+1, TempMin, media);

	}

}
