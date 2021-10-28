package Aula_10_09_21;
import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio7{

	public static String bingo[][] = new String [5][5];
	public static int sorteio[] = new int [25];
	public static Random random = new Random();
	public static DecimalFormat formatador = new DecimalFormat("00");

	public static void main (String[] args) {
	myMethod();
	myMethod1();
	}

	static void myMethod() {
		System.out.println("Sorteio");
		for(int loop =0 ; loop < sorteio.length; loop++){
			boolean y = false;
			while(y == false){
			int loop1 = -1;
			int x = random.nextInt(99);
			while(loop1 < loop){
				if (sorteio[loop1+1] == x){
				break;
				}
				loop1++;
				if (loop1 == loop){
				sorteio[loop] = x;
				y = true;
				}
			}
			}
		System.out.printf("%s ", formatador.format(sorteio[loop]));
		}
	}

	static void myMethod1() {
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Bingo");
		int n = -1;
		for (int linha = 0; linha < bingo.length; linha++){
			for (int coluna = 0; coluna < bingo.length;coluna++){
			n++;
			bingo[linha][coluna] = formatador.format(sorteio[n]);
			System.out.printf("%s  ", bingo[linha][coluna]);
			}
		System.out.printf("\n");
		}
	}
}
