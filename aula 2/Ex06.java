package entrada_processamento_saida;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double d, c, r;
		
		System.out.printf("Digite o valor em dólares: ");
		d = ler.nextDouble();
		
		System.out.printf("Digite a cotação do dólar: ");
		c = ler.nextDouble();
		
		r = d * c;
		
		System.out.printf("O valor em reais é %.2f", r);
		
		ler.close();

	}

}
