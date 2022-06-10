// Program to make a menu driven banking application with balnce check,balance withdraw and balance deposit choice
package OOPs;
import java.util.Scanner;
class Account{
    // instance variables
    private long accountNo;
    private String accHolderName;
    private int accBalance;
    private String accType;
    public Account (long accountNo,String accHolderName,int accBalance,String accType)
    // constructor
    {
        this.accountNo=accountNo;
        this.accHolderName=accHolderName;
        this.accBalance=accBalance;
        this.accType=accType;
    }
    public void withdraw(int amount) { // method for withdraw money
        if (amount > this.accBalance) {
            System.out.println("You have not sufficient balance");
            System.out.println("Your current account balance is Rs." + this.accBalance);
        }
        else {
            this.accBalance = this.accBalance - amount;
            System.out.println("Your account has been debited with Rs."+amount);
            System.out.println("Your current account balance is Rs." + this.accBalance);
            System.out.println("Thank you for banking with us");
        }
    }
    public void check() // method for balance enquiry
    {
        System.out.println("Account holder name: "+ this.accHolderName);
        System.out.println("Account Number: "+this.accountNo);
        System.out.println("Account type: "+this.accType);
        System.out.println("Your account balance is Rs."+this.accBalance);
        System.out.println("Thank you for banking with us");
    }
    public void deposit(int amount) // method for deposit money
    {
        this.accBalance=this.accBalance+amount;
        System.out.println("Your account has been credited with Rs."+amount);
        System.out.println("Your current account balace is Rs."+this.accBalance);
        System.out.println("Thank you for banking with us");
    }

}
public class AccountManagement {
    public static void main(String[] args) {
        int choice, Amount; // variables declare in main method
        Account Customer = new Account(178902081, "Debtanu", 50000, "Savings"); // class instantaniate
        System.out.println("Welcome to Deb Bank of India\nPlease enter your Choice\nPress 1 for balance enquiry\nPress 2 for deposit \nPress 3 for Withdrawl");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt(); // taking choice from user
        switch (choice) {
            case 1:
                Customer.check();
                break;
            case 2:
                System.out.println("Enter the amount you want to deposit ");
                Amount = sc.nextInt();
                Customer.deposit(Amount);
                break;
            case 3:
                System.out.println("Enter the money you want to withdrawl ");
                Amount = sc.nextInt();
                Customer.withdraw(Amount);
                break;
            default:
                System.out.println("Please enter a valid entry");
        }
    }
}

