package studentsystem;
import java.util.Scanner;
public class StudentService {
    static Student student[]=new Student[10];
    static Scanner sc=new Scanner(System.in);
    static int index=0;

    public static void  createStudent()
    {
        int id;
        String name,address;
        System.out.println("enter student id:");
        id=sc.nextInt();
        sc.nextLine();
        System.out.println("enter student name:");
        name=sc.nextLine();

        System.out.println("enter student address:");
        address=sc.nextLine();
        student[index]=new Student(id,name, address);
        index++;
        System.out.println("Students has been added successfully");
    }

    public static void getStudentById(int id) throws StudentNotFoundException
    {
        for(int i=0;i<index;i++) {
            if(id==student[i].getStudentId())
            {
                //System.out.println(student[i]);
                System.out.println("Student id: "+student[i].getStudentId());
                System.out.println("Student Name: "+student[i].getStudentName());
                System.out.println("Student Address: "+student[i].getAddress());
            }
            else
            {
                throw new StudentNotFoundException("student not found with id: "+ id);
            }
        }
    }

    }


