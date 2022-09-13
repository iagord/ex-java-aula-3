package ddd;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double v1, v2, v3;
		
		System.out.printf("Digite o valor de um lado do triângulo: ");
		v1 = ler.nextDouble();
		
		System.out.printf("Digite o valor de outro lado do triângulo: ");
		v2 = ler.nextDouble();
		
		System.out.printf("Digite o valor de mais um lado do triângulo: ");
		v3 = ler.nextDouble();
		
		if ((v1 + v2 > v3) || (v2 + v3 > v1) || (v3 + v1 > v2)) {
			if ((v1 == v2) && (v1 == v3) && (v2 == v3)) {
		        System.out.printf("Seu triânguo é equilátero!");
		        }
			else if ((v1 != v2) && (v1 != v3) && (v2 != v3)) {
				System.out.printf("Seu triângulo é escaleno!");
				}
		    else {
		        System.out.printf("Seu triângulo é isósceles!");
		        }
		}
		ler.close();

	}

}
