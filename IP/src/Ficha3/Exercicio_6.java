package Ficha_3;

public class Exercicio_6 {

	public static void main(String[] args) {
		char letra = 'd', letraInversa =' ';
		
		if(Character.isLetter(letra) && Character.isUpperCase(letra)) {
			letraInversa = Character.toLowerCase(letra);
			System.out.printf("A letra %c é uma letra maiuscula e o seu inverso é %c", letra, letraInversa);
		} else if(Character.isLetter(letra) && Character.isLowerCase(letra)){
			letraInversa = Character.toUpperCase(letra);
			System.out.printf("A letra %c é uma letra minuscula e o seu inverso é %c", letra, letraInversa);
		}
		
	}

}
