import java.util.Scanner;

public class Ex37F {

    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    
    int i = 1;
    int j;

    for(i = 1;i <= 20; i++ ){
        for(j = 1; j <= 10; j++){
            System.out.println(i + " x " + j + " = " + (i * j));
           
        }
        System.out.print("Digite algo para continuar ");
        entrada.next();
    }

    entrada.close();
    }
}