package Aula_10_09_21;
import java.util.Random;
import java.text.DecimalFormat;

public class Exercicio5 {

	public static int matriz[][] = new int[4][4];
	public static Random random = new Random();
	public static DecimalFormat formatador = new DecimalFormat("00");

	public static void main(String[] args) {
		myMethod();
	}

	private static void myMethod() {
		for(int linha=0; linha< matriz.length; linha++) {
			for(int coluna=0; coluna< matriz.length; coluna++) {
				matriz[linha][coluna] = (linha+1)*(coluna+1);
				System.out.printf("%s  ", formatador.format(matriz[linha][coluna]));
			}
			System.out.printf("\n");
		}
	}
}