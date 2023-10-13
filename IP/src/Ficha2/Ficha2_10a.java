package ficha2;

public class Ficha2_10a {

	public static void main(String[] args) {
		int x1 = 20, y1 = 10, x2 = 5, y2 = 4;
		double dist = Math.sqrt(Math.pow(x2-x1, 2) + ((y2-y1) * (y2-y1)));
		System.out.printf("distancia. %.3f", dist);

	}

}
