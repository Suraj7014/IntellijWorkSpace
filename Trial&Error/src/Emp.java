public class Emp {

    int eid;
    int salary;
    static String ceo;

    public void show(){
        System.out.println(" eid " +eid +" s "+salary +" ce  "+ceo);
    }

    public static void main(String[] args) {

        Emp navin = new Emp();
        navin.eid =6;
        navin.salary= 500;
       // navin.ceo = "mahesh";

        Emp rahul = new Emp();
        rahul.eid =6;
        rahul.salary= 500;
        //rahul.ceo = "mahesh";
        Emp.ceo = "mahesh";

        //navin.ceo = "prakash";
        //if we uncomment the above code then the static block will be updated..
        //and change che ceo with prakash for both rahul as well as prakash..
        rahul.show();
        navin.show();


    }
}
