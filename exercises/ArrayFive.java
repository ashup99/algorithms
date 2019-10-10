package exercises;
import java.util.Scanner;

//Faça um Programa que leia um vetor de 5 números inteiros e mostre-os

public class ArrayFive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arrayFive = new int[5];
		
		for(int x = 0; x < 5; x++) {
			arrayFive[x] = sc.nextInt();
		}
		
		for(int x = 0; x < arrayFive.length; x++) {
			System.out.println("Número " + (x + 1) + " é: " + arrayFive[x]);
		}
		
		
		sc.close();

	}

}
