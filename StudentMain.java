package studentsystem;
import java.util.Scanner;
public class StudentMain {
    public static void main(String[] args) {
        int choice;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Welcome to Student Management system");
            System.out.println("Press 1. for create student\nPress 2. for get student by id\n"
                    + "Press 3. for quit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                    StudentService.createStudent();

                    System.out.println("=====================================");
                    break;

                case 2:
                    System.out.println("Enter id to search:");
                    int id=sc.nextInt();
                    try {
                        StudentService.getStudentById(id);
                    }catch(StudentNotFoundException sf)
                    {
                        System.out.println(sf.getMessage());
                    }
                    System.out.println("=====================================");
                    break;

                case 3: break;
            }
        }while(choice!=3);
    }

}
