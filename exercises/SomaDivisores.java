package exercises;
import java.util.Scanner;

/*Escreva um programa que leia um numero inteiro e calcule a soma de todos os divisores 
desse numero, com excecão dele próprio. Ex: a soma dos divisores do número 66 é
1 + 2 + 3 + 6 + 11 + 22 + 33 = 78
 */

public class SomaDivisores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número positivo");
		int num = sc.nextInt();
		
		int soma = 0;
		for(int x = 1; x < num; x++) {
			if(num % x == 0) {
				soma += x;
				System.out.printf("%d + ", x);
			}
		}
		System.out.printf("total = %d", soma);
		
		
		
		
		sc.close();
		
	}

}
