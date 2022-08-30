package entrada_processamento_saida;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double p1, p2, p3, p4, p5, pag, t;
		
		System.out.printf("Digite o valor do primeiro produto: ");
		p1 = ler.nextDouble();
		
		System.out.printf("Digite o valor do segundo produto: ");
		p2 = ler.nextDouble();
		
		System.out.printf("Digite o valor do terceiro produto: ");
		p3 = ler.nextDouble();
		
		System.out.printf("Digite o valor do quarto produto: ");
		p4 = ler.nextDouble();
		
		System.out.printf("Digite o valor do quinto produto: ");
		p5 = ler.nextDouble();
		
		System.out.printf("Digite o valor pago: ");
		pag = ler.nextDouble();
		
		t = pag - (p1 + p2 + p3 + p4 + p5);
		
		System.out.printf("O seu troco é %.2f", t);
		
		ler.close();

	}

}
