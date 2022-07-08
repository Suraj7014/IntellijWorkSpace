import java.io.Serializable;

public class Date implements Serializable {

    private int dd;
    private int mm;
    private int yy;

    public Date(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    public Date(long lastModified) {
    }

    @Override
    public String toString() {
        return "Date{" +
                "dd=" + dd +
                ", mm=" + mm +
                ", yy=" + yy +
                '}';
    }
}
