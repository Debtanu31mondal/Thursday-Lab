package OOPs;
class Employees {
    // instance variable declaration
    long employeeId, empPhno;
    String employeeName, employeeAddress;
    double basicSalary, specialAllownce = 250.80, Hra = 1000.50;

    public Employees(long Id, String name, String address, long phone, double salary) {
        // Employee class constructor
        employeeId = Id;
        employeeName = name;
        employeeAddress = address;
        empPhno = phone;
        basicSalary = salary;
    }

    public void calculateSalary() { // method for calculating salary
        double salary;
        {
            salary = basicSalary + (basicSalary * specialAllownce / 100) + (basicSalary * Hra / 100);
            System.out.println("The Salary is: " + salary);
        }

    } // end of calculateSalary method
    public void calculateTransportAllowance() { // method for calculating transport allowance for rest of the employee except manager
        double transportAllowance;
        {
            transportAllowance = (10*basicSalary)/100;
            System.out.println("The Transport allowance of Trainee is:  " + transportAllowance);
        }
    } // end of method calculateTransportAllowance
}
class Manager extends Employees // creating sub class manager (Hierarchical inheritance)
{
    public Manager(long Id,String name,String address,long phone,double salary) // subclass constructor (Constructor overloading)
    {
        super(Id,name,address,phone,salary);
    }
    public void calculateTransportAllowance() { // method for calculating transport allowance of manager (Overriding)
        double transportAllowance;
        {
            transportAllowance = (15*basicSalary)/100;
            System.out.println("The Transport allowance of Manager is:  " + transportAllowance);
        }
    } // end of method
} // end of sub class Manager
class Trainee extends Employees{ // another sub class for Trainee (Hirarchical inheritance)
        public Trainee(long Id,String name,String address,long phone,double salary){ //subclass constructor (Constructor overloading)
            super(Id,name,address,phone,salary);
        }

}
public class InheritanceActivity {
    public static void main(String[] args) { // main method
        Manager manager=new Manager(126534,"Peter","Chennai India",237844,65000); // object creation in Manager class
        manager.calculatesalary();// method invoking to calculate salary of the manager
        manager.calculateTransportAllowance(); // method invoking to calculate transport allowance of the manager
        Trainee trainee=new Trainee(29846,"Jack","Mumbai India",442085,45000); // object creation in the Trainee class
        trainee.calculatesalary(); // method invoking to calculate salary of the trainee
        trainee.calculateTransportAllowance(); // method invoking to calculate transport allowance of the trainee
    } // end of main method
}
