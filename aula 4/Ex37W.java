import java.util.Scanner;

public class Ex37W {

    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    
    int i = 1;
    int j;

    while (i <= 20) {

        j = 1;
        
        while (j <= 10){
            System.out.println(i + " x " + j + " = " + (i * j));
            j++;
        }

        System.out.print("Digite algo para continuar ");
        entrada.next();

        i++;
        j = 1;
    }
    entrada.close();
    }
}