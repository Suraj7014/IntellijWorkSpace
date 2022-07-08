import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileWriting {
    //we have to take input from the console and create the file foor it.
    public static void main(String[] args) {

        BufferedReader br = null;
        OutputStream os = null;
        try {
        br = new BufferedReader(new InputStreamReader(System.in));
            //BuffeRedeader cannot be empty . it should be provided with some reader.
            //br will take what should be written on the file.
        os = new FileOutputStream("D:/serial.txt");
            //this is to write whats taken on the file.
        String str;
            System.out.println("Enter 'quit' to stop");
            while (!(str=br.readLine()).equals("quit")){
                os.write(str.getBytes());
                os.write("\n".getBytes());

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                assert br != null;
                br.close();
                assert os != null;
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
