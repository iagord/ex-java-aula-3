package ddd;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double p, a ,imc;
		
		System.out.printf("Digite seu peso: ");
		p = ler.nextDouble();
		
		System.out.printf("Digite sua altura: ");
		a = ler.nextDouble();
		
		imc = p / (a * a);
		
		if ((imc >= 18.5) && (imc <= 24.9)) {
			System.out.printf("Você está no peso ideal!");
		}
		else {
			System.out.printf("Você não está no peso ideal!");
		}
		
		ler.close();

	}

}
