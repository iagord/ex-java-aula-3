package ddd;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double p, a, imc;
		
		String s;
		
		System.out.printf("Digite seu sexo: ");
		s = ler.next();
		
		System.out.printf("Digite seu peso: ");
		p = ler.nextDouble();
		
		System.out.printf("Digite sua altura: ");
		a = ler.nextDouble();
		
		imc = p / (a * a);
		
		if ((s == "Feminino") && (s == "fem") && (s == "F")) {
		    if (imc < 19) {
		        System.out.printf("Seu IMC é %.1f e você está abaixo do peso.");
		        }
		    else if ((imc >= 19) && (imc <= 24)){
		        System.out.printf("Seu IMC é %.1f e você está no peso ideal.");
		        }
		    else if (imc > 24) {
		        System.out.printf("Seu IMC é %.1f e você está acima do peso.");
		        }
		}
		else if ((s == "Masculino") && (s == "masc") && (s == "M")) {
		    if (imc < 20) {
		        System.out.printf("Seu IMC é %.1f e você está abaixo do peso.");
		    }
		    else if ((imc >= 20) && (imc <= 25)) {
		        System.out.printf("Seu IMC é %.1f e você está no peso ideal.");
		        }
		    else if (imc > 25) {
		        System.out.printf("Seu IMC é %.1f e você está acima do peso.");
		        }
		        }
		ler.close();

	}

}
