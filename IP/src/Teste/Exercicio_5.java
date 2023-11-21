package ficha;
import java.util.Scanner;
public class Exercicio_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String []zona = {"1º Plateia", "2º Plateia", "Balcão", "Camarote"};
		
		int []precoBilhete = {30, 20, 40, 70};
		
		int []assentosDisponiveis = {200, 100, 100, 10};
		
		int opcao;
		
    	do {
    		for(int i = 0; i < zona.length; i++)
        		System.out.printf("%d: %s \t(%d€)-\t %3d lugares disponiveis\n", i+1, zona[i], precoBilhete[i], assentosDisponiveis[i]);
        	System.out.println("0 para sair");
    		do {
    			System.out.println("Escolha uma opcao 0-4: ");
    			opcao = input.nextInt();
    		}while(opcao<0 || opcao>4);
    		
    		if(opcao !=0) {
    			System.out.println("Quantos bilhetes desejas: ");
    			int quantidade = input.nextInt();
    			
    			if(quantidade > assentosDisponiveis[opcao-1]) {
    				System.out.println("Bilhetes esgotados");
    			} else {
    				int precoFinal = quantidade * precoBilhete[opcao-1];
    				assentosDisponiveis[opcao-1]-= quantidade;
    				System.out.printf("Preco final: %d€\n", precoFinal);
    			}
    		} else {
    			System.out.println("Obrigado pela visita! :)");
    		}
    	}while(opcao != 0);
        
		
		
	}

}
