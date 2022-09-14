import java.util.Scanner;

public class Ex31DW {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double valor;
        do {
            System.out.printf("Digite o preço do produto: ");
            valor = ler.nextDouble();
        } while (valor < 0);

        ler.close();

    }

}