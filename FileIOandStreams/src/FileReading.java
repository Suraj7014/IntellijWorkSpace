import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReading {

    public static void main(String[] args) {
        File f = new File ("D:/buffer.txt");
        System.out.println("file size : "+f.length());
        System.out.println("Directory : "+f.isDirectory());
        Date d = new Date(f.lastModified());
        System.out.println("Readable : "+f.canRead());
        FileInputStream fis = null;

        try{

            if (f.exists()){
                if (f.isFile() && f.canRead()){
                    int i;
                    fis = new FileInputStream(f);
                    //why byte array only and not anything else?
                    byte [] arr = new byte[100];
                    while ((i = fis.read(arr))!=-1)
                        System.out.println(new String(arr));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("finished file reading");

    }
}
