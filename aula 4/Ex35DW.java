import java.util.Scanner;

public class Ex35DW {

    public static void main(String[] args) {

            int i = 1;
            int j = 1;
            int valor = 0;

            Scanner entrada = new Scanner(System.in);
            

            do{
                System.out.print("Entre com um valor: ");
                valor = entrada.nextInt();
            } while (valor <= 0);

            entrada.close();
            
            do {
                do {
                    System.out.println(i + " x " + j + " = " + (i * j));
                    j++;
                } while(j <= 10);

                i++;
                j = 1;
            } while(i <= valor);

    }
}