package ficha2;

public class Ficha2_9 {

	public static void main(String[] args) {
		double graus = 90;
		double grausEmRad = Math.toRadians(graus);
		double sin = Math.sin(grausEmRad), cos = Math.cos(grausEmRad);
		double tg = Math.tan(grausEmRad), cotangente = cos/sin;
		
		System.out.printf("seno = %.3f \ncoseno = %.3f \ntangente = %.3f \nCotanegente = %.3f", sin, cos, tg, cotangente);
		
	
		
	

	}

}
