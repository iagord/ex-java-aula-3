import java.util.Scanner;

public class Ex41W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, i, soma, termo;
	
		System.out.println("Digite o termo que quer encontrar (valor deve ser positivo e menor que 100): ");
		n = ler.nextInt();
		
		while ((n <= 0) || (n > 100)) {
			System.out.println("O valor de N deve ser positivo e menor que 100.");
			System.out.println("Digite o termo que quer encontrar (valor deve ser positivo e menor que 100): ");
			n = ler.nextInt();
		}
		
		i = 1;
		soma = 0;
		
		while (i <=n) {
			termo = ( (int) Math.pow(i,2) + 1);
			System.out.println(i + ". " + termo);
			i++;
			soma = soma + termo;	
		}System.out.println("A soma é: " + soma);
        ler.close();
	}

}