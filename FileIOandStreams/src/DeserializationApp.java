import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DeserializationApp {

    public static void main(String[] args) throws FileNotFoundException {

        ObjectInputStream ois = null;
        try {
            List<Emp> emparr = new ArrayList<>();
            while (true){
                try{
                    emparr.add((Emp)ois.readObject());
                } catch (Exception e) {
                    e.printStackTrace();
                    break;
                }
            }
            for(Emp e: emparr){
                System.out.println(e);
            }
            ois.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("---End---");

    }

}
