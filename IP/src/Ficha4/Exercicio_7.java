import java.util.Scanner;
public class Exercicio_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insira um numero: ");
		int limite = input.nextInt();
		int soma = 0, n =0;
		
		while(soma <= limite) {
			n++;
			soma += n;			
		}
		System.out.printf("soma final: %d\nnº de vezes somado: %d", soma, n);
	}

}
