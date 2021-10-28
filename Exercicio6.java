package Aula_10_09_21;
import java.util.Random;

public class Exercicio6 {

	public static int matriz[][] = new int[3][3];
	public static int matriz1[] = new int[3];
	public static int soma;
	public static Random random = new Random();

	public static void main(String[] args) {
		myMethod();
	}

	private static void myMethod() {
		for (int linha = 0; linha < matriz.length; linha++){
			for (int coluna = 0; coluna < matriz[0].length; coluna++){
				matriz[linha][coluna] = random.nextInt(8)+1;
				System.out.printf("%d  ",matriz[linha][coluna]);
			}
			System.out.printf("\n");
		}
		System.out.printf("\n");

		System.out.println("Diagonal principal:");
		matriz1[0] = matriz[0][1];
		System.out.printf("%d  ",matriz1[0]);
		matriz1[1] = matriz[0][2];
		System.out.printf("%d  ",matriz1[1]);
		matriz1[2] = matriz[1][2];
		System.out.printf("%d  ",matriz1[2]);

		System.out.printf("\n");
		System.out.printf("\n");

		for (int l = 0; l < matriz1.length; l++) {
			soma += matriz1[l];
		}
		System.out.printf("Soma: %d",soma);
		System.out.printf("\n");
	}
}
