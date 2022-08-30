package entrada_processamento_saida;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n1, n2, n3, n4, media;
		
		System.out.printf("Digite o primeiro valor: ");
		n1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo valor: ");
		n2 = ler.nextDouble();
		
		System.out.printf("Digite o segundo valor: ");
		n3 = ler.nextDouble();
		
		System.out.printf("Digite o quarto valor: ");
		n4 = ler.nextDouble();
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.printf("A média aritmética é: %.2f", media);
		
		ler.close();

	}

}
