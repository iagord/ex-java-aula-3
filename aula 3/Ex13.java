package ddd;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int v1, v2, v3;
		
		System.out.printf("Digite um valor: ");
		v1 = ler.nextInt();
		
		System.out.printf("Digite outro valor: ");
		v2 = ler.nextInt();
		
		System.out.printf("Digite mais um valor: ");
		v3 = ler.nextInt();
		
		if ((v1 > v2) && (v1 > v3)) {
			System.out.print(v1);
		}
		else if ((v2 > v1) && (v2 > v3)) {
			System.out.print(v2);
		}
		else if ((v3 > v1) && (v3 > v2)) {
			System.out.print(v3);
		}
		
		ler.close();

	}

}
