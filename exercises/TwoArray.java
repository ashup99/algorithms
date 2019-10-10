package exercises;

import java.util.Scanner;

// Crie um vetor com 5 elementos inteiros. Construir um vetor B de "mesmo" tipo e tamanho e com os mesmos elementos do vetor A.


public class TwoArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int [5];
		int[] vetorB = new int [5];
		
		System.out.println("Vetor A - Digite cinco números: ");
		for(int x = 0; x < vetorA.length; x++) {
			vetorA [x] = sc.nextInt();
			System.out.println("Posição " + (x + 1) + " :" + vetorA[x]);
		}
		
		System.out.println();
		System.out.println("Vetor B");
		for(int x = 0; x < vetorB.length; x++) {
			vetorB [x] = vetorA [x];
			System.out.println("Posição " + (x + 1) + " :" + vetorB[x]);
		}
		
		sc.close();

	}

}
