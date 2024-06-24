package ch02.ex01print;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.Scanner;

public class App {
  public static void main(String[] args) throws IOException {
    //Consoleoutputstream cos = new Consoleoutputstream();
    PrintStream out = new PrintStream(System.out);
    System.out.write(50);
    System.out.print(50);
    System.out.println(80);
    //System.out.print("ab\bcd\tef\\\"g");

      int kor1;
      int kor2;
      int kor3;
      int total;
      double avg;

      FileInputStream fis = new FileInputStream("res/data.txt");
      Scanner scan = new Scanner(fis);


      kor1 = scan.nextInt();
      kor2 = scan.nextInt();
      kor3 = scan.nextInt();

      scan.close();
      fis.close();      


      total = kor1 + kor2 + kor3;
      avg = total/3.0;
    
    System.out.println("┌──────────────────┐");
    System.out.println("│     성적 출력    │");
    System.out.println("└──────────────────┘");
    System.out.println("국어1 : "+ kor1);
    System.out.println("국어2 : "+ kor2);
    System.out.println("국어3 : "+ kor3);
    System.out.println("총점 : "+ total);
    System.out.printf("평균 : %.2f ", avg);
    System.out.println();

     System.out.println("┌──────────────────┐");
     System.out.println("│     성적 입력    │");
     System.out.println("└──────────────────┘");
   
   
     Scanner scan1 = new Scanner(System.in);
     System.out.print("kor1>");
     kor1 = scan1.nextInt();
     System.out.print("kor2>");
     kor2 = scan1.nextInt();
     System.out.print("kor3>");
     kor3 = scan1.nextInt();

    //scan1.close();

    
    
    
    //System.out.printf("1:%d\n2:%10d\n3:%-10d",3, 3, 3);
    //System.out.printf("%5.2f\n", 36.66666666);
    
    
    FileOutputStream fos = new FileOutputStream("res/data.txt");
    PrintStream fout = new PrintStream(fos,true, Charset.forName("utf-8"));
    fout.printf("%d %d %d", kor1,kor2,kor3);

    
      
    fout.close();
    fos.close();

    System.out.println();
    System.out.println("저장이 완료되었습니다.");

    

    

  }
  
}
