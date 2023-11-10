package ficha_5;
public class Exercicio_1 {

	public static void main(String[] args) {
		double []notas = {12, 9, 4, 20, 17, 13, 13, 2, 19, 17, 15, 10, 10, 14, 12, 18, 15, 14, 20, 18};
		double max = notas[0];
		double pior = notas[0];
		int aprovados = 0;
		int reprovados = 0;
		
		for(int i = 0; i < notas.length; i++) {
			if(notas[i] > max) {
				max = notas[i];
			}
			
			if(notas[i] < pior) {
				pior = notas[i];
			}
			
			if(notas[i] >= 9.5) 
				aprovados++;
			else 
				reprovados++;
		}
		
		System.out.printf("A maior nota foi: %f\nA pior nota foi: %f\nNº de alunos aprovados: %d\nNº de alunos reprovados: %d", max, pior, aprovados, reprovados);

	}

}
