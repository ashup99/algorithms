/*2) Ler uma matriz quadrada de ordem N, contendo números reais. Em seguida, fazer as seguintes ações:
a) calcular e imprimir a soma de todos os elementos positivos da matriz.
b) fazer a leitura do índice de uma linha da matriz e, daí, imprimir todos os elementos desta linha.
c) fazer a leitura do índice de uma coluna da matriz e, daí, imprimir todos os elementos desta coluna.
d) imprimir os elementos da diagonal principal da matriz.
e) alterar a matriz elevando ao quadrado todos os números negativos da mesma. Em seguida imprimir a matriz alterada.
 */

package exercises;

import java.util.Locale;
import java.util.Scanner;

public class MatrizQuadrada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[][] real = new double[n][n];
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				real[i][j] = sc.nextDouble();
			}
		}
		
		//calculando e imprimindo a soma dos elementos positivos da matriz.
		System.out.println();
		double sum = 0;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				if(real[i][j] > 0) {
					sum += real[i][j];
				}
			}
		}
		System.out.printf("SOMA DOS POSITIVOS: %.1f", sum);
		
		//leitura do índice de uma linha da matriz e impressão dos elementos desta linha.
		System.out.println();
		System.out.printf("Escolha uma linha da matriz de 0 a %d: ", n-1);
		int x = sc.nextInt();
		System.out.println("LINHA ESCOLHIDA: " );
		for(int i = x; i<= x; i++) {
			for(int j = 0; j<n; j++) {
				System.out.printf("%.1f ", real[i][j]);
			}
		}
		
		//fazer a leitura do índice de uma coluna da matriz e, imprimir todos os elementos desta coluna.
		System.out.println();
		System.out.printf("Escolha uma coluna da matriz de 0 a %d: ", n-1);
		int y = sc.nextInt();
		System.out.println("COLUNA ESCOLHIDA: ");
		for(int i = y; i<=y; i++) {
			for(int j = 0; j<n; j++) {
				System.out.printf("%.1f%n ", real[j][i]);
			}
		}
		
		//imprimir os elementos da diagonal principal da matriz.
		System.out.println();
		System.out.println("DIAGONAL PRINCIPAL: ");
		for(int i = 0; i<n; i++) {
			for(int j = i; j==i; j++) {
				System.out.printf("%.1f ", real[i][j]); 
			}
		}
		
		//alterar a matriz elevando ao quadrado todos os números negativos da mesma. Em seguida imprimir a matriz alterada.
		System.out.println();
		System.out.println("MATRIZ ALTERADA: ");
		int exp = 2;
		for(int i = 0; i<real.length; i++) {
			for(int j = 0; j<real.length; j++) {
				if(real[i][j] < 0) {
					real[i][j] = Math.pow(real[i][j], exp);
				}
				System.out.printf("%.1f ", real[i][j]);
			}
			
		}
		
		
		
		sc.close();

	}

}
