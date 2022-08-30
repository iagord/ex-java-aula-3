package entrada_processamento_saida;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double b, a, area;
		
		System.out.printf("Digite o valor da base: ");
		b = ler.nextDouble();
		
		System.out.printf("Digite o valor da altura: ");
		a = ler.nextDouble();
		
		area = (b * a) / 2;
		
		System.out.printf("A area é: %.2f", area);
		
		ler.close();

	}

}
