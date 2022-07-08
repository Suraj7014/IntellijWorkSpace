
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationApp {
    //the class date we want to save should implement serializable

    public static void main(String[] args) {

        ObjectOutputStream oos = null;
        try{
            oos = new ObjectOutputStream(new FileOutputStream("D:/emp.dat"));
            Emp[] empArr = new Emp[5];
            empArr[0] = new Emp(002, "stash", 50000, 11,5,2011, 15);
            empArr [1] = new Emp(001, "prasad", 50000, 5,11, 2012, 5);
            for(Emp e: empArr){
                oos.writeObject(e);
            }
            System.out.println("Object created!! ");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}
