// Program to find whether a number is an armstrong number or not
package BasicProgram;
import java.util.Scanner;
public class ArmstrongNumber {
    public void findArmstrong(int num){ // method creation
        int rem,count=0,temp; // variables declaration in method
        temp=num;  // holding the input for future use
        while(num>0)
        {
            rem=num%10;
            count=count+(rem*rem*rem);
            num=num/10;
        }
        if (temp==count) //  checking entered number is equal or not with count
            System.out.println("The number is an armstrong number");
        else
            System.out.println("The number is not an armstrong number");
    } // end of method
    public static void main(String[] args) {
        int number; // variable declare in main method
        System.out.println("Enter the number:");
        Scanner sc= new Scanner(System.in);
        number=sc.nextInt(); // taking input from user
        ArmstrongNumber check= new ArmstrongNumber(); // class instantaniate
        check.findArmstrong(number); // method invoking
    } // end of main method
}
