package ch03.ex01string;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws FileNotFoundException {
    
    
    FileInputStream fis = new FileInputStream("res/data.csv");
    Scanner scan = new Scanner(fis);
    scan.nextLine();// "이름,국어,영어,수학"
    {
      String line = scan.nextLine();
      
      
      String[]tokens = line.split(",");
      String name = tokens[0]; // 강호동
      //문자열 -> 정수
      //정수 -> 문자열
      int kor = Integer.parseInt(tokens[1]);//90
      int eng = Integer.parseInt(tokens[2]);//80
      int math = Integer.parseInt(tokens[3]);
      
      System.out.println(line);
      System.out.printf("%s,kor:%d,eng:%d,math:%d",name,kor,eng,math);
    }

    //------------------------------------------------------------
      {
        String line = scan.nextLine();
        
        
        String[]tokens = line.split(",");
        String name = tokens[0]; // 강호동
        //문자열 -> 정수
        //정수 -> 문자열
        int kor = Integer.parseInt(tokens[1]);//90
        int eng = Integer.parseInt(tokens[2]);//80
        int math = Integer.parseInt(tokens[3]);
        
        System.out.println();
        System.out.println(line);
        System.out.printf("%s,kor:%d,eng:%d,math:%d",name,kor,eng,math);
      }  
    
    


  
    
  }
  
}
