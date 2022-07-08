import java.util.Scanner;

public class Name {
    private String fn;
    private String mn;
    private String ln;

    public Name() {
        this.fn = "";
        this.mn = "";
        this.ln = "";
    }

    public Name(String fn, String mn, String ln) {
        this.fn = fn;
        this.mn = mn;
        this.ln = ln;
    }

    @Override
    public String toString() {
        return fn  + " " + mn + " " + ln ;
    }

    public void input(){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your full name:" +"\n" +"First name");

        fn = sc.nextLine();
        System.out.println("Middle name");
        mn = sc.nextLine();
        System.out.println("Last name");
        ln = sc.nextLine();
    }
}
