import java.util.Scanner;

public class Employee {

    private Name name;
    private Date dateOfBirth;
    private int empId;
//    protected double salary;
    //do this overriding and overloading...


    //noparameter constructor
    public Employee() {
        this.name = new Name();
        this.dateOfBirth = new Date();
        this.empId = 001;
    }


    //parameterized constructor
    public Employee(Name name, Date dateOfBirth, int empId) {
        this.name = new Name();
        this.dateOfBirth = new Date();
        this.empId = empId;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        name.input();
        System.out.println("Enter date of birth: ");
        dateOfBirth.input();
        System.out.println("Enter new Employee Id");
        empId = in.nextInt();
    }

//    public void print() {
//        System.out.println("Employee Name:@ " + name);
//        System.out.println("Date Of Birth: @ " + dateOfBirth);
//        System.out.println("Employee Id: " + empId);
//    }


   public String toString() {
       return " "+ name +"  dateOfBirth=" + dateOfBirth +"  empId=" + empId;
   }
}
