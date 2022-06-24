package OOPs;
interface LibraryUser{ // Creating interface
    void registerAccount(); // abstract method
    void requestBook(); // abstract method
}
class KidUsers implements LibraryUser { // creating a sub class by implementing the above created interface
    //instance variable of the sub class
    private int age;
    private String bookType;

    public KidUsers(int age, String bookType) { // constructor of the sub class
        this.age = age;
        this.bookType = bookType;
    }

    public void registerAccount() { // creating method for register account of kids
        if (age < 12)
            System.out.println("You have successfully registeres under Kids Account");
        else
            System.out.println("Sorry your age must be under 12nto register as a kid");
    } // end of method registerAccount

    public void requestBook() { // creating method for request books for kids
        if (bookType == "Kids")
            System.out.println("Book issued successfylly,please return the book within 10 days");
        else
            System.out.println("Oops,you are allowed to take only kids books");
    } // end of method requestBook
} // end of class sub class Kidsusers
 class AdultUsers implements LibraryUser // another sub class for adultusers
 {
    private int age;
    private String bookType; // instance variable declaration in sub class
     public AdultUsers(int age,String bookType) // constrctor for the sub class
     {
         this.age=age;
         this.bookType=bookType;
     }
     public void registerAccount(){ // creating method for register account of adults
         if(age>12)
             System.out.println("You have successfully registered under Adult Account");
         else
             System.out.println("Sorry your age must be greater than 12 to register as a adult");
     }
     public void requestBook(){ // creating method for request books for adults
         if(bookType=="Fiction")
             System.out.println("Book issued successfylly,please return the book within 10 days");
            else
             System.out.println("Oops,you are allowed to take only Adult fiction books");
     } // end of method requestBook
 } // end of class sub class AdultUsers

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUsers kids=new KidUsers(10,"Kids"); // object creation in the KidUsers Class
        kids.registerAccount(); // method invoke to register account for kids
        kids.requestBook(); // method invoke for request book for kids
        AdultUsers adult=new AdultUsers(23,"Fiction"); // object creation in the AdultUsers Class
        adult.registerAccount(); // method invoke to register account for adults
        adult.requestBook(); // method invoke for request book for adults

    } // end of main method
}
