import java.util.Scanner;

public class ContEmp extends Employee {

    private float hRate;
    private int noHour;

    //
    public ContEmp() {
        this.hRate = 0;
        this.noHour = 0;
    }

    public ContEmp(Name name, Date dateOfBirth, int empId, float hRate, int noHour) {
        super(name, dateOfBirth, empId);
        this.hRate = hRate;
        this.noHour = noHour;
    }

    public void input(){

        Scanner sc = new Scanner(System.in);

        super.input();

        System.out.println("Hourly Rate: ");
        hRate = sc.nextFloat();
        System.out.println("Total Hours: ");
        noHour = sc.nextInt();
    }


    //for the data that is declared in this class will use the print method for the output but
    //for op of the parent class we require the toString method to use.
    //

    //
//    public void print(){
//        System.out.println("Contract-Employee");
//        super.print();
//        System.out.println("Hourly Rate: "+hRate);
//        System.out.println("No of Hours: "+noHour);
//    }

    @Override
    public String toString() {
        return super.toString() + hRate +":  Number of Hour worked= " + noHour;

    }


}
