public class Ex38W {

    public static void main(String[] args) {
       // Exibir a soma de 1 e 100

         // Variáveis
            int i = 1;
            int soma = 0;

            // Processamento
           while(i <= 100){
            soma = soma + i;
            i++;
           }

           System.out.println("A soma de 1 a 100 é: " + soma);
    }
}