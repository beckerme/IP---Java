package ficha2;

public class ficha2_11 {

	public static void main(String[] args) {
		double preco = 30;
		int desconto = 50;
		double precoFinal = (double) desconto/100 * preco;
		double quantidadeDescontada = preco - precoFinal;
		System.out.printf("%-14s%8.2f\n","Preço:", preco);
		System.out.printf("%-14s%5d%%\n","Desconto:", desconto);
		System.out.printf("%-14s%8.2f\n","Desconto:" ,quantidadeDescontada);
		System.out.printf("%-14s%8.2f","Preco final:", precoFinal);


	}

}
