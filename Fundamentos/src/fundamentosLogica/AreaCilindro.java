package fundamentosLogica;

import java.util.Scanner;

public class AreaCilindro {

	public static void main(String[] args) {
		/*Calcular e apresentar o valor do volume de
		 * uma lata de óleo com a fórmula fornecida*/
		
		double V;
		float R, A;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor do Raio da lata em cm: ");
		R = sc.nextFloat();
		System.out.println("Insira o valor da Área da lata em cm²: ");
		A = sc.nextFloat();
		
		V = (3.14159 * R * R * A);
		System.out.printf("O volume da lata é: %.2f",V," cm³");

	}

}
