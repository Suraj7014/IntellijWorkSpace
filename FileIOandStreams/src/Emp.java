import java.io.Serializable;

public class Emp implements Serializable {

    private int empid;
    private String name;
    private double salary;
    private Date join_date;
    private transient int com_months;

    public Emp(int empid, String name, double salary,int dd,int mm,int yy, int com_months) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.join_date = new Date(dd, mm, yy);
        this.com_months = com_months;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", join_date=" + join_date +
                ", com_months=" + com_months +
                '}';
    }
}
