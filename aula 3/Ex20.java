package ddd;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double p1, media, p2;
		
		media = 5;
		
		System.out.printf("Digite a nota da p1: ");
		p1 = ler.nextDouble();
		
		p2 = ((3 * media) - p1) / 2;
		
		System.out.printf("Você precisa tirar %.1f para ser aprovado.", p2);
		
		ler.close();

	}

}
