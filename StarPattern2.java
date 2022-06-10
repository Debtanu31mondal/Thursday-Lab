package BasicProgram;

public class StarPattern2 {
    public static void main(String[] args) {
        int i, j, k; // variable declaration
        for (i = 1; i <= 5; i++) { // outer loop for row
            for (j = 5; j > i; j--) { // inner loop for space print
                System.out.print("  ");
            }
            for (k = 1; k <(2*i); k++) { // inner loop for column
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
