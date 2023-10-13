package ficha2;

public class Ficha2_10b {

	public static void main(String[] args) {
		int x1 = 5, y1 = 2, x2 = 20, y2 = 4;
		int diferencaY = y2 - y1;
		int diferencaX = x2 - x1;
		double declive = (double)diferencaY / diferencaX;
		double b = y1 - x1 * declive;
		
		System.out.printf("y= %.2fx + %.2f", declive, b);

	}

}
