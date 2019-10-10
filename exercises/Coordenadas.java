package exercises;
import java.util.Locale;
import java.util.Scanner;

/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual 
o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
*/
public class Coordenadas {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float x = sc.nextFloat();
		float y = sc.nextFloat();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
		else if (x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else if (x > 0 && y < 0) {
			System.out.println("Q4");
		}
		else if (x == 0 && y > 0 || y < 0) {
			System.out.println("Eixo Y");
		}
		else if (x > 0 || x < 0 && y == 0) {
			System.out.println("Eixo X");
		}
		
		sc.close();
	}

}
