public class Ex39W {

    public static void main(String[] args) {
		int n, t1, t2, t3, cont;
		
		
		n = 30; 
		t1 = 1; 
		t2 = 1;
		
		System.out.printf(" %d -> %d ", t1, t2);
		cont = 3;
		
		while (cont <= n) {
		    t3 = t1 + t2;
		    System.out.printf("-> %d ", t3);
		    t1 = t2; 
		    t2 = t3;
		    cont++; 
		}

    }
}