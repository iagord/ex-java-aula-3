import java.util.Scanner;

public class Ex36W {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int ct = 1;
        int tt = 1;
        int v = 0;

        System.out.print("Entre com um valor: ");
        v = entrada.nextInt();


         while (v < 0){
            System.out.print("Entre com um valor: ");
            v = entrada.nextInt();
        }

        System.out.print("Entre com começo da tabuada: ");
        ct = entrada.nextInt();

        System.out.print("Entre com o final da tabuada: ");
        tt = entrada.nextInt();


        while (ct > tt){
            System.out.println("O começo da tabuada não pode ser maior que o final");
            System.out.print("Entre com o final da tabuada:");
                tt = entrada.nextInt();
        }

        while (tt >= ct){
            System.out.println(v * tt);
            tt--;
        }
        entrada.close();
    }
}