import java.util.Scanner;

public class Ex49F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int x, y, soma;
		
		System.out.println("Digite o início do intervalo: ");
		x = ler.nextInt();
		
		System.out.println("Digite o final do intervalo: ");
		y = ler.nextInt();
		
		while (y <= x) {
			System.out.println("O valor final deve ser maior do que o valor inicial.");
			System.out.println("Digite o final do intervalo: ");
			y = ler.nextInt();
		}

        ler.close();
		
		soma = 0;
		
		for (x=1;x<=(y+1);x++) {
			soma = soma + x;
		}
		
		System.out.println("A soma dos valores do intervalo é: " + soma);
	}
}