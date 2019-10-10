/*No tabuleiro de xadrez, a casa na linha 1, coluna 1 (canto superior esquerdo) é sempre branca e as cores das 
 * casas se alternam entre branca e preta, de acordo com o padrão conhecido como... xadrez! Dessa forma, como o 
 * tabuleiro tradicional tem oito linhas e oito colunas, a casa na linha 8, coluna 8 (canto inferior direito) 
 * será também branca. Neste problema, entretanto, queremos saber a cor da casa no canto inferior direito de um 
 * tabuleiro com dimensões quaisquer: L linhas e C colunas. No exemplo da figura, para L = 6 e C = 9, a casa no 
 * canto inferior direito será preta!
 * Entrada:
 * A primeira linha da entrada contém um inteiro L (1 ≤ L ≤ 1000) indicando o número de linhas do tabuleiro. A segunda 
 * linha da entrada contém um inteiro C (1 ≤ C ≤ 1000) representando o número de colunas.
 * Saída:
 * Imprima uma linha na saída. A linha deve conter um inteiro, representando a cor da casa no canto inferior direito do 
 * tabuleiro: 1, se for branca; e 0, se for preta.
 */

package exercises;

import java.util.Scanner;

public class Problem2787 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int c = sc.nextInt();
		
		if(l % 2 == 0) { //Se a quantidade de linhas for par, a última casa da linha será sempre preta
			if(c % 2 == 0) {//E se a quantidade de casas da coluna também for par, então a última casa da coluna será sempre branca
				System.out.println("1");
			}
			else {
				System.out.println("0");//Mas se a coluna for ímpar, então a última casa da coluna será sempre preta
			}
		}
		
		if(l % 2 != 0) {//Se a quantidade de linhas do tabuleiro for ímpar, então haverá a troca de cores, sendo a última casa da linha branca
			if(c % 2 == 0) {
				System.out.println("0");
			}
			else {
				System.out.println("1");
			}
		}
		
		
		
		sc.close();
	}

}
