package exercicios;

public class Exercicio_6 {

	public static void main(String[] args) {
		int []idadeAlunos = { 26, 18, 19, 42, 41, 12, 38, 19, 29, 15, 21, 40, 29, 30, 42, 20, 45, 30, 28, 34, 39, 26, 16, 33, 39, 34,36, 22, 23, 19};
		String []categorias = {"<= 17 anos: ", "=18 anos: ", "=19 anos: ", "=20 anos: ", ">21 anos: "};
		int []contadores = {0, 0, 0, 0, 0};
		
		for(int i = 0; i < idadeAlunos.length; i++) {
			if(idadeAlunos[i] <= 17)
				contadores[0]++;
			else if(idadeAlunos[i] == 18)
				contadores[1]++;
			else if(idadeAlunos[i] == 19)
				contadores[2]++;
			else if(idadeAlunos[i] == 20)
				contadores[3]++;
			else if(idadeAlunos[i] >= 21)
				contadores[4]++;
		}
		
		for(int j = 0; j < contadores.length; j++) {
			System.out.printf("%s\t %d", categorias[j], contadores[j]);
			System.out.println();
		}
		
		for(int k = 0; k < categorias.length; k++) {
			System.out.print(categorias[k]);
			for(int a = 0; a < contadores[k]; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
