package BasicProgram;
import java.util.Scanner;
public class SumOfNaturalNo {
    public void sums(int n){ // method creation
        int i,sum = 0; // variables declaration in method
        for (i = 1; i <= n; i++) { // doing the sum of 1 to n number using for loop
            sum = sum + i;
        }
        System.out.println("The sum of 1 to "+n+ " is: " + sum);
    } // end of method
    public static void main(String[] args) {
        int no; // variable declare in main method
        System.out.println("Enter the upper limit"); // taking input from user
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        SumOfNaturalNo checkSum=new SumOfNaturalNo(); // class instantaniate
        checkSum.sums(no); // method invoking
    }  // end of main method
}
