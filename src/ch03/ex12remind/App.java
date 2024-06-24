package ch03.ex12remind;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {

        // filtering, res/remind.data->res/valid.data
        {
            FileInputStream fis = new FileInputStream("res/remind.data");
            Scanner scan = new Scanner(fis);

            FileOutputStream fos = new FileOutputStream("res/valid.data");
            PrintStream ps = new PrintStream(fos, true);

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (isNumeric(line)) {
                    ps.print(line);
                    if (scan.hasNextLine())
                        ps.println();
                }
            }
            scan.close();
            fis.close();
            ps.close();
            fos.close();
        }

        // mapping, res/valid.data->grade.data
        {
            FileInputStream fis = new FileInputStream("res/valid.data");
            Scanner scan = new Scanner(fis);

            FileOutputStream fos = new FileOutputStream("res/grade.data");
            PrintStream ps = new PrintStream(fos, true);

            while (scan.hasNextLine()) {
                int score = Integer.parseInt(scan.nextLine()); // 원점수
                String grade = "N";

                if (score == 100)
                    grade = "A+";
                else if(90 <= score&& score<=99)
                    grade = "A";
                else if (80 <= score&& score<=89)
                    grade = "B";
                else if (70 <= score&& score<=79)
                    grade = "C";
                else if (60 <= score&& score<=69)
                    grade = "D";
                else
                    grade = "F";
                ps.print(grade);

                if (scan.hasNextLine())
                    ps.println();
            }

            scan.close();
            fis.close();
            ps.close();
            fos.close();
        }

        // reducing : count, res/valid.data
        int count = 0;
        {
            FileInputStream fis = new FileInputStream("res/valid.data");
            Scanner scan = new Scanner(fis);

            while (scan.hasNextLine()) {
                int score = Integer.parseInt(scan.nextLine());                            
                count++;
            }

            scan.close();
            fis.close();

            System.out.printf("count is %d\n", count);
        }

        // reducing : total, res/valid.data
        int total = 0;
        {
            FileInputStream fis = new FileInputStream("res/valid.data");
            Scanner scan = new Scanner(fis);

            while (scan.hasNextLine()) {
                total += Integer.parseInt(scan.nextLine());
            }

            scan.close();
            fis.close();

            System.out.printf("total is %d\n", total);
        }

        // reducing : avg
        {
            double avg = 0;

            avg = total/(double)count;

            System.out.printf("avg is %6.2f\n", avg);
        }
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}