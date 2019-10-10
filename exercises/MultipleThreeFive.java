package exercises;
import java.util.Scanner;

//Faça um programa que some todos os numeros naturais abaixo de 1000 que são múltiplos de 3 ou 5.

public class MultipleThreeFive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1000;
		int soma = 0;
		
		for (int x = 0; x < num; x++) {
			if(x % 3 == 0 || x % 5 == 0) {
				soma += x;
			}
		}
		System.out.println(soma);
		
		
		sc.close();
		
		

	}

}
