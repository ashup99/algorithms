package exercises;

import java.util.Scanner;

/*Faça um programa que calcule e mostre a soma dos 50 primeiros números pares.
 */

public class FiftyFirst {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cont = 0;
		int soma = 0;
		System.out.println("Números pares: ");
		for(int x = 1; cont < 50; x++) {
			if(x % 2 == 0) {
				cont ++;
				soma = soma + x;
				System.out.println(x);
			}
		}
		System.out.printf("SOMA TOTAL: %d", soma);
		
		
		sc.close();
		
	}

}
