package Aula_10_09_21;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {

	public static int vetor1[] = new int[10];
	public static int vetor2[] = new int[10];
	public static int vetor3[] = new int[10];

	public static List<String> arrayLIST = new ArrayList<>();
	public static String array[];

	public static Random random = new Random();

	public static void main(String[] args) throws Exception {
		myMethod();
	}

	private static void myMethod() {
		System.out.print("V1");
		System.out.print("V2");
		System.out.println(" ");

		for (int loop = 0; loop < vetor1.length; loop++){
			vetor1[loop] = random.nextInt(9)+1;
			System.out.print(vetor1[loop]);
			System.out.print(" ");
			vetor2[loop] = random.nextInt(9)+1;
			System.out.print(vetor2[loop]);
			System.out.println(" ");
		}

		for (int loop1 = 0; loop1 < vetor1.length; loop1++){
			for(int loop2 = 0; loop2 < vetor1.length; loop2++){
				if(vetor1[loop1] == vetor2[loop2]){
					int loop4 = 0;
					while(loop4 < vetor1.length){
						if (vetor1[loop1] == vetor3[loop4]) {
							break;
						}
						loop4++;
						if (loop4 == vetor1.length) {
							vetor3[loop1] = vetor1[loop1];
							arrayLIST.add(Integer.toString(vetor1[loop1]));
						}
					}
				}
			}
		}

		System.out.println(" ");
		System.out.print("V3: ");
		System.out.println(arrayLIST);
		System.out.println(" ");

		array = arrayLIST.toArray(new String[0]);
		System.out.print("V3: ");
		Arrays.stream(array).forEach(System.out::print);
		System.out.println(" ");
	}
}
