package exercicios;
import java.util.Scanner;
public class Exercicio_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String []meses = {"", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		
		System.out.print("Escreva uma data no formato dd/mm/a:\n");
		String dataInserida = input.next();
		
		String []temp = dataInserida.split("/");
		
//		for(int i = 0; i < temp.length; i++) {
//			System.out.println(temp[i]);
//		}
		
		int mes = Integer.parseInt(temp[1]);
		
		System.out.printf("%s de %s de %s", temp[0], meses[mes], temp[2]);
		
	}

}
