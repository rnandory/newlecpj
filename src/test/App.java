package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        // 1
        {
            FileInputStream f = new FileInputStream("res/data2 copy.txt");
            int b = f.read();
            System.out.printf("1. b : %d\n", b);
            f.close();

        }
        
        // // 2
        // {
        //     FileInputStream f = new FileInputStream("res/data2 copy.txt");
        //     String w = "" + (char) f.read() + (char) f.read();
        //     System.out.printf("2. w : %s\n", w);
        //     f.close();
        // }
        // 2 -1
        {
            FileInputStream f = new FileInputStream("res/data2 copy.txt");
            Scanner scan = new Scanner(f);
            String w = scan.next()/* .substring(0, 2) */;
            System.out.printf("2. w : %s\n", w);
        
            f.close();
        }
        
        // 3
        {
            FileInputStream f = new FileInputStream("res/data2 copy.txt");
            Scanner scan = new Scanner(f);
            String l = scan.nextLine();
            System.out.printf("3. l : %s\n", l);
            f.close();
            scan.close();
        }
        
    }
}
