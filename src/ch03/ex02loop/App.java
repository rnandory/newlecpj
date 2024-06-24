package ch03.ex02loop;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("res/data.csv");
    Scanner scan = new Scanner(fis);
    scan.nextLine();// "이름,국어,영어,수학"

    while(scan.hasNextLine())
    {
      String line = scan.nextLine();
      // 
      //System.out.printf("line : %s\n", line);
      
      
      String[]tokens = line.split(",");
      //
      //System.out.printf("tokens : %s\n", Arrays.toString(tokens));

      String name = tokens[0]; // 강호동
      //문자열 -> 정수
      //정수 -> 문자열
      int kor = Integer.parseInt(tokens[1]);//90
      int eng = Integer.parseInt(tokens[2]);//80
      int math = Integer.parseInt(tokens[3]);
      
      //System.out.println(line);
      System.out.printf("name:%s kor:%d eng:%d math:%d\n",name,kor,eng,math);
    }

    System.out.print("end");

    scan.close();
    fis.close();

    //-------------------------------------------------------------
    


  
    
  }
  
}
