// Find whether the entered number is a strong number or not
package BasicProgram;
import java.util.Scanner;
public class StrongNumber {
    public static int fact(int no){ // method fact for doing factorial
        int i,f=1;
        for (i = 1; i <= no; i++) {
            f = f * i;
        }
        return f;
    } // end of fact method
    public void findStrong(int num) { // method findStrong for cheking strong number or not
        int factorial, count = 0, rem, temp; // variable declaration in method findStrong
        temp = num; // holding the input for future use
        while (num > 0) {
            rem = num % 10; // holding the remainder
            factorial=fact(rem); // invoking method fact
            count = count + factorial; // storing the added factorial value of each digit
            num = num / 10;
        }
        if (count == temp) // checking entered number is equal or not with count
            System.out.println("This is a strong number");
        else
            System.out.println("This is not a strong number");
    } // end of method findStrong
    public static void main(String[] args) {
        int number;// variable declare in main method
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt(); // taking input from user
        StrongNumber check = new StrongNumber(); // class instantaniate
        check.findStrong(number); // method invoking
    } // end of main method
}
