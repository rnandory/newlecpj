import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class pr_wed {
    public static void main(String[] args) throws IOException {
        // 1.
        {
            int x = 10;
            int y = 20;
    
            FileOutputStream fos = new FileOutputStream("res/data1.txt");
            fos.write(x);
            fos.write(y);
        }
        
        // 3.
        {
            int x = 10;
            int y = 20;

            FileOutputStream fos = new FileOutputStream("res/data2.txt");
            PrintStream ps = new PrintStream(fos);
            ps.print(x);
            ps.print(y);
        }

        // 
        {
            int x = 128;
            // int y = 256;

            /* ???
            long y = 256L;
            
            byte[] byteArray = new byte[8];
            for (int i = 0; i < 8; i++) {
                byteArray[i] = (byte) (y >> (8 * i));
            } */

            FileOutputStream fos = new FileOutputStream("res/data3.txt");
            fos.write(x);
            //fos.write(byteArray);
            fos.flush();
        }
        

        

    }
}
