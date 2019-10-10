/*
 * No planeta Alpha vive a criatura Blobs, que come precisamente 1/2 de seu suprimento de comida disponível todos os dias.
 * Escreva um algoritmo que leia a capacidade inicial de suprimento de comida (em Kg), e calcule quantos dias passarão antes 
 * que Blobs coma todo esse suprimento até restar um quilo ou menos.
 */

package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Problem1170 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, dias;
		double c;
		
		n = sc.nextInt();
		for (int x = 1; n >= x; x++) {
			c = sc.nextDouble();
			dias = 0;
			while(c >= 1) {
				c /= 2;
				dias ++;
			}
			System.out.printf("%d dias%n", dias);
		}
		
		
		
		
		
		sc.close();
	}

}
