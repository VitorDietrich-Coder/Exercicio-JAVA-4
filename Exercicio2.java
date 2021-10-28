package Aula_10_09_21;

import java.util.Random;

public class Exercicio2 {
	public static int soma,valor1,valor2;
	public static int x, y, i,j;
	public static int vetor1[] = new int[8];
	public static int vetor2[] = new int[1];
	public static int vetor3[] = new int[1];
	public static Random random = new Random();
	public static void main(String[] args) {
			method1();
	}

	private static void method1() { 
		for(int i = 0; i <vetor1.length ; i++){
			vetor1[i] = random.nextInt(8);
		
		}	
			x = random.nextInt(7);
			y = random.nextInt(7);
			
			System.out.println(" ");
			System.out.printf("X %d V %d \n", x, vetor1[x]);
			System.out.printf("Y %d V %d \n", y, vetor1[y]);
			System.out.println(" ");
			System.out.printf("X %d + Y %d = %d \n", vetor1[y], vetor1[x], vetor1[y] + vetor1[x]);
		}
	
		}	
		
	
	

