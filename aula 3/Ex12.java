package ddd;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int b, a, area;
		
		System.out.printf("Digite a base: ");
		b = ler.nextInt();
		
		System.out.printf("Digite a altura: ");
		a = ler.nextInt();
		
		area = b * a;
		
		if (area > 100) {
			System.out.println(area);
			System.out.printf("Terreno Grande");
		}
		else if (area < 100) {
			System.out.println(area);
			System.out.printf("Terreno Pequeno");
		}
		
		ler.close();

	}

}
