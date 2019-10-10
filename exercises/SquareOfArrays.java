package exercises;

import java.util.Locale;
import java.util.Scanner;

/*Ler um conjunto de numeros reais, armazenando-o em vetor e calcular o quadrado dos componentes deste vetor, armazenando o 
resultado em outro vetor. Os conjuntos tem 10 elementos cada. Imprimir todos os conjuntos.
 */

public class SquareOfArrays {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double[] array = new double[10];	
		double[] quadrado = new double[10];
		
		for(int x = 0; x < 10; x++) {
			array[x] = sc.nextDouble();
		}
		
		for(int x = 0; x < array.length; x++) {
			quadrado[x] = array[x] * array[x];
			System.out.printf("Vetor 1 = %.2f%n", array[x]);
			System.out.printf("Quadrado do vetor 1 = %.2f%n", quadrado[x]);
		}
		
		
		sc.close();

	}

}
