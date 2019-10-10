package exercises;
import java.util.Scanner;
//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.

public class Impares {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int x = sc.nextInt();
		for(int num = 1; num <= x; num++) {
			if(num % 2 != 0) {
				System.out.println(num);
			}
			
		}
		
		
		sc.close();
	}

}
