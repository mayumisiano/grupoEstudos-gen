package lacosCondicionais.Lista1;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		
		//Abaixo, ME é a média dos Exercicios e MA é a média final
		float nota1,nota2,nota3,ME,MA;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota: ");
		nota1= leia.nextFloat();
		System.out.println("Insira a segunda nota: ");
		nota2= leia.nextFloat();
		System.out.println("Insira a terceira nota: ");
		nota3= leia.nextFloat();
		
		System.out.println("Insira a nota da média dos exercícios (ME): ");
		ME= leia.nextFloat();
		
		MA = (nota1 + nota2*2 + nota3*3 + ME)/7;
		
		if(MA>=90) {
			System.out.println("A média final foi: "+MA+", com conceito A");
		}else if(MA>=7.5 && MA<9.0) {
			System.out.println("A média final foi: "+MA+", com conceito B");
		}else if(MA>=6.0 && MA<7.5) {
			System.out.println("A média final foi: "+MA+", com conceito C");
		}else if(MA>=4.0 && MA<6.0) {
			System.out.println("A média final foi: "+MA+", com conceito D");
		}else {
			System.out.println("A média final foi: "+MA+", com conceito E");
		}
		
	}

}
