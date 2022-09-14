public class Ex40W {

	public static void main(String[] args) {
		
		int a0, a1, an, indice, ax;
		
		a0 = 1;
		a1 = 1;
		an = 1;
		indice = 1;
		
		while (indice <= 20) {
			while (indice <= 3) {
				System.out.println(indice + ". " + an);
				indice++;
			}ax = a0 + a1 + an;
			System.out.println(indice + ". " + ax);
			a0 = a1;
			a1 = an;
			an = ax;
			indice = indice + 1;
		}
	}

}