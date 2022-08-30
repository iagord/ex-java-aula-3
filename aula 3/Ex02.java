package ddd;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int v1, v2;
		
		System.out.printf("Digite um valor: ");
		v1 = ler.nextInt();
		
		System.out.printf("Digite outro valor: ");
		v2 = ler.nextInt();
		
		if (v1 > v2) {
			System.out.print(v2);
		}
		else if (v2 > v1) {
			System.out.print(v1);
		}
		
		ler.close();

	}

}
