package exercises;

import java.util.Scanner;

public class LinhaQuadradoCubo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int n = sc.nextInt();
		
		int quad = 1;
		int cubo = 1;
		for( int x = 1; x <= n; x++) {
			quad = x * x;
			cubo = (x * x) * x;
			System.out.printf("%d %d %d%n", x, quad, cubo);
		}
		
		sc.close();
	}

}
