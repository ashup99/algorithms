/*No jogo de xadrez, a torre pode se mover livremente somente na horizontal e vertical, conforme indicado na figura.
Durante uma partida de xadrez, se a torre se move até uma outra peça, então a torre captura essa peça. Considerando o
sistema de coordenadas da figura, você deve fazer um programa para ler uma matriz 8x8 contendo "zeros" e "uns",
representando um tabuleiro de xadrez, onde cada "um" indica que há uma peça naquela posição do tabuleiro. Em seguida,
você deve ler a posição de uma torre. O programa deve então dizer a posição da peça capturada.
Exemplo de tabuleiros:
0 0 0 0 0 0 0 0     
0 0 1 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 1 0 0 0 0 0 0
0 0 0 0 0 0 0 0
*/

package exercises;

import java.util.Scanner;

public class TowerChess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] board = new int[8][8];
		
		System.out.println("Digite 0 ou 1 para criar o tabuleiro de xadrez, sendo 0 para uma casa vazia e 1 para posicionar peça");
		for(int i = 0; i<board.length; i++) {
			for(int j = 0; j<board.length; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("Digite a coluna e fileira da torre respectivamente: ");
		int column = sc.nextInt();
		int row = sc.nextInt();
		
		//achando peça na coluna do tabuleiro
		for(int i = column-1; i<=column-1; i++) {
			for(int j = 0; j<board.length; j++) {
				if(board[i][j] == 1) {
					System.out.printf("Peça capturada na posição %d,%d ", i+1, j+1);
				}
			}
		}
		//Achando peça na fileira do tabuleiro
		for(int i = row-1; i<=row-1; i++) {
			for (int j = 0; j<board.length; j++) {
				if(board[j][i] == 1) {
					System.out.printf("Peça capturada na posição %d,%d: ", j+1, i+1);
				}
			}
		}
		
		sc.close();

	}

}
