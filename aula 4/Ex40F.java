public class Ex40F {

	public static void main(String[] args) {
		
		int a0, a1, an, indice, ax;
		
		a0 = 1;
		a1 = 1;
		an = 1;
		indice = 1;
		
		for (indice = 1; indice <= 20; indice++) {
			if (indice <= 3) {
				System.out.println(indice + ". " + an);
			}else{
				ax = a0 + a1 + an;
				System.out.println(indice + ". " + ax);
				a0 = a1;
				a1 = an;
				an = ax;
			}
		}
	}
}