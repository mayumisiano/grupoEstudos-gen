package lacosCondicionais.Lista1;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		float h, p, IMC;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira sua altura: ");
		h = leia.nextFloat();
		System.out.println("Insira seu peso: ");
		p = leia.nextFloat();
		
		IMC = p / (h*h);
		
		if(IMC < 18.5) {
			System.out.println("O seu índice IMC É: "+IMC+". Você está abaixo do peso");
		}else if(18.5 < IMC && IMC < 25) {
			System.out.println("O seu índice IMC É: "+IMC+". Você está com Peso normal");
		}else if(25 < IMC && IMC < 30) {
			System.out.println("O seu índice IMC É: "+IMC+". Você está Acima do peso");
		}else {
			System.out.println("O seu índice IMC É: "+IMC+". Você está Obeso");
		}	

	}

}
