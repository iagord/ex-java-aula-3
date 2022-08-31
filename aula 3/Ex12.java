package ddd;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double p1, p2, m;
		
		System.out.printf("Digite sua p1: ");
		p1 = ler.nextDouble();
		
		System.out.printf("Digite sua p2: ");
		p2 = ler.nextDouble();
		
		m = (p1 + (2 * p2)) / 3;
		
		if (m >= 5) {
			System.out.printf("Sua média foi %f.2f e você foi Aprovado!");
		}
		else if (m < 5) {
			System.out.printf("Sua média foi %f.2f e você foi Reprovado.");
		}
		
		ler.close();

	}

}
