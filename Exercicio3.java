package Aula_10_09_21;

import java.util.Random;

public class Exercicio3 {
		public static int soma,valor1,valor2;
		public static int x;
	
		public static int pos = 0;
		public static int maior;
		public static int vetor1[] = new int[10];
	
		public static Random random = new Random();
		public static void main(String[] args) {
				method1();
		}

		private static void method1() { 
			for(int i = 0; i <vetor1.length ; i++){
				vetor1[i] = random.nextInt(10);
				System.out.println(vetor1[i]);
				
			}
			maior = vetor1[0];
			for(int i = 0; i <10 ; i++){
			if (vetor1[i] > maior) {
				maior = vetor1[i];
				pos = i;
				}	
			}
		
			for(int j = 0; j <vetor1.length ; j++){
				if (vetor1[j] == maior) {
					System.out.println("Maior valor: " + maior);
					System.out.println("Posição: "+ j);
				
				}
		
			}
	
		}
}	
	