package exercises;
import java.util.Scanner;

/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
 */

public class Intervalo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores você quer digitar?");
		int val = sc.nextInt();
		
		int in = 0;
		int out = 0;
		for(int x = 1; x <= val; x++) {
			int num = sc.nextInt();
			if (num >= 10 && num <= 20) {
				in++;
			}
			else {
				out++;
			}
		}
		System.out.printf("%d in%n", in);
		System.out.printf("%d out%n", out);
		
		
		sc.close();
	}

}
