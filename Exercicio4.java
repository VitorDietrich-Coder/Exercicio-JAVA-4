package Aula_10_09_21;

import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio4 {
	public static int soma,valor1,i;
	public static String vetor1[] = new String[5];
	public static Random random = new Random();
	public static DecimalFormat formatterD = new DecimalFormat("0.000");
	public static void main(String[] args) {
			method1();
		}
	private static void method1() { 
		for (int i = 0; i < vetor1.length; i++) {
			vetor1[i] = formatterD.format(random.nextDouble());
			}
		System.out.println("0 - Finalize o programa");
		System.out.println("1 - mostre o vetor na ordem direta que foi inserido");
		System.out.println("2 - mostre o vetor na ordem inversa");
		
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite uma das opções");
			valor1 = entrada.nextInt();
			System.out.println(valor1);
			
			if(valor1 == 1) {
				for (int i = 0; i < vetor1.length; i++) {
				System.out.println(vetor1[i]);
				}
			}
			else if (valor1 == 0) {
				System.out.println("Programa Encerrado");
			}
			else if (valor1 == 2) {
				for (int i = 4; i > -1; i--) {
					System.out.println(vetor1[i]);
				}
			}
				else {
					System.out.println("Valor inválido");
					
				}
						
			}
			
		}



