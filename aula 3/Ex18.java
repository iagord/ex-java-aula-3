package ddd;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, v0, t, v;
		
		System.out.printf("Digite a aceleração: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite a velocidade inicial: ");
		v0 = ler.nextDouble();
		
		System.out.printf("Digite o tempo de percurso: ");
		t = ler.nextDouble();
		
		v = (v0 + (a * t)) * 3.6;
		
		if (v <= 40) {
			System.out.printf("Veículo muito lento.");
		}
		else if ((v > 40) && (v <= 60)) {
			System.out.printf("Velocidade permitida.");
		}
		else if ((v > 60) && (v <= 80)) {
			System.out.printf("Velocidade de cruzeiro.");
		}
		else if ((v > 80) && (v <= 120)) {
			System.out.printf("Veículo rápido.");
		}
		else {
			System.out.printf("Veículo muito rápido.");
		}
		
		ler.close();

	}

}
