
import java.util.LinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinkedList <Object> list = new LinkedList<Object>();

        Scanner sc = new Scanner(System.in);

        int ch;
        System.out.println("Enter valid number to enter the information about the new designation");

        do{
            ch=sc.nextInt();

            switch(ch) {

                case 1:
                    System.out.println("Enter details about the Employee");

                    Employee employee = new Employee();
                    employee.input();
//                    employee.print();

                case 2:
                    System.out.println("Enter details about Contract-Employee: ");

                    ContEmp c = new ContEmp();
                    c.input();
                    //c.print();
                    //this will print the everything in the print class. but not the date and name..
                    //because has a between employee and date&name...
                    //this will




                    //so we are passing c object to print and so the toString is passied via object class...
                    //all the toString are now displayed...
                    System.out.println(c);
//                    c.toString();

                case 3:

            }
        }while (ch!=0);

    }
}
