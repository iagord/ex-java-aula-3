package entrada_processamento_saida;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double c, f;
		
		System.out.printf("Digite celcius: ");
		c = ler.nextDouble();
		
		f = (c * 1.8) + 32;
		
		System.out.printf("%.2f Fahrenheit", f);
		
		ler.close();

	}

}
