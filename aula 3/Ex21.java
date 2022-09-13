package ddd;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double v1, v2;
		
		int resposta;
		
		System.out.printf("Digite o primeiro valor: ");
		v1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo valor: ");
		v2 = ler.nextDouble();
		
		System.out.println("-------------Calculadora-------------");
		System.out.println("1 - Multiplicação");
		System.out.println("2 - Adição");
		System.out.println("3 - Divisão");
		System.out.println("4 - Subtração");
		System.out.println("5 - Fim do processo");
		System.out.println("-------------------------------------");
		
		System.out.println("Digite sua opção: ");
		resposta = ler.nextInt();
		
		if (resposta == 1) {
			System.out.printf("A multiplicação é %1.f", v1 * v2);
			System.out.println("-------------Fim do programa-------------");
		}
		else if (resposta == 2) {
			System.out.printf("A soma é %1.f", v1 + v2);
			System.out.println("-------------Fim do programa-------------");
		}
		else if (resposta == 3) {
			if ((v1 == 0) || (v2 == 0)) {
				System.out.printf("Erro");
				System.out.println("-------------Fim do programa-------------");
			}
			else {
			System.out.printf("A divisão é %1.f", v1 / v2);
			System.out.println("-------------Fim do programa-------------");
			}
		}
		else if (resposta == 4) {
			System.out.printf("A subtração é %1.f", v1 - v2);
			System.out.println("-------------Fim do programa-------------");
		}
		else if (resposta == 5) {
			System.out.println("-------------Fim do programa-------------");
		}
		else {
			System.out.printf("Comando não encontrado.");
		}
		ler.close();

	}

}
