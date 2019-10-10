package exercises;
import java.util.Scanner;

/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
 */
public class Fatorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int soma = 1;
		for(int x = 1; x <= n; x++) {
			soma = soma * x;
			}	
		System.out.println(soma);
		sc.close();
		
	}
}

