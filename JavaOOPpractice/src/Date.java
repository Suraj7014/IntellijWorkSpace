import java.util.Scanner;

public class Date {

    int dd;
    int mm;
    int yy;

    public Date() {
        this.dd = 0;
        this.mm = 0;
        this.yy = 0;
    }

    public Date(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    public Date(Date date) {
        this.dd = date.dd;
        this.mm = date.mm;
        this.yy = date.yy;
    }

    @Override
    public String toString() {
        return dd + "/" + mm + "/" + yy ;
    }

    public void input() {
        Scanner in = new Scanner(System.in);

        System.out.println("Year:");
        yy = in.nextInt();
        System.out.println("Month:");
        mm = in.nextInt();
        System.out.println("Date");
        dd = in.nextInt();
    }

}
