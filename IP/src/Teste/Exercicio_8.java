package exercicios;

public class Exercicio_8 {

	public static void main(String[] args) {
		double []lucroMensal = { 4870, 11206, 9059, 3370, 3828, 8123, 5903, 399, 1185, 10489, 6220, 3161};
		String []meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		double totalAnual = 0;
		
		for(int i = 0; i < meses.length; i++) {
			totalAnual += lucroMensal[i];
			System.out.printf("%-14s - %9.2f\n", meses[i], lucroMensal[i]);
		}
		
		System.out.printf("%-12s %9.2f", "Total anual", totalAnual);
	}

}
