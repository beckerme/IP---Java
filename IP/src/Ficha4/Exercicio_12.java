import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char primeiraLetra, segundaLetra;
		
		do {
			System.out.print("\nEscreva a primeira letra do par de caracteres: ");
			primeiraLetra = input.next().charAt(0);
			System.out.print("\nEscreva a segunda letra do par de caracteres: ");
			segundaLetra = input.next().charAt(0);
			
			if(primeiraLetra >= 'a' && primeiraLetra <= 'z' || primeiraLetra >= 'A' && primeiraLetra <= 'Z') {
				if(primeiraLetra > segundaLetra) {
					for(char i = primeiraLetra; i >= segundaLetra; i--) {
						System.out.print(i);
					} 
				} else if(primeiraLetra < segundaLetra) {
					for(char i = primeiraLetra; i <= segundaLetra; i++) {
						System.out.print(i);
					}
				}
			}else {
				System.out.print("Pelo menos um dos caracteres introduzidos nao e uma minuscula/maiuscula");
			}
			
		}while(primeiraLetra != '.' || segundaLetra != '.');
	}

}
