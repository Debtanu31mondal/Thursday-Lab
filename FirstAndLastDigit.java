package BasicProgram;
import java.util.Scanner;
public class FirstAndLastDigit {
    public void findFirstLast(int num){
        int last; // variables declaration in method
        last=num%10; // finding last digit
        while(num>10) // finding first digit
        {
            num=num/10;
        }
        System.out.println("The first digit is: "+num);
        System.out.println("The last digit is: "+last);
    } // end of method
    public static void main(String[] args) {
        int number; // variable declare in main method
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt(); // taking input from user
        FirstAndLastDigit find=new FirstAndLastDigit(); // class instantaniate
        find.findFirstLast(number); // method invoking
    } // end of main method
}
