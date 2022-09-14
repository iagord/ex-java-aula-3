public class Ex34DW {

    public static void main(String[] args) {

        int i = 1;
        int j = 1;

        do {
            do {
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            } while (j <= 10);
            i++;
            j = 1;
        } while (i <= 10);
        
    }
}