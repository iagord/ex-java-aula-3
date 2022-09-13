package ddd;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double v1, v2, v3;
		
		System.out.printf("Digite um valor: ");
		v1 = ler.nextDouble();
		
		System.out.printf("Digite outro valor: ");
		v2 = ler.nextDouble();
		
		System.out.printf("Digite mais um valor: ");
		v3 = ler.nextDouble();
		
		if (v1 == ((v2 * v2) + (v3 * v3)/v1) && (v3 == (v2 * v2) + (v1 * v1)/v3) && (v2 == (v3 * v3) + (v1 * v1)/v2)) {
		    System.out.printf("Seu triângulo é retângulo!");
		    }
		else {
		    System.out.printf("Seu triângulo não é retângulo!");
		    }
		ler.close();

	}

}
