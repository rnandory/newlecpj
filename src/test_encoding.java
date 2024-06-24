import java.nio.charset.Charset;
import java.util.Scanner;

public class test_encoding {
    public static void main(String[] args) {
        char c = '\uFFFD'; // replacement Character
        System.out.println(c);

        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a character: ");
            String str = sc.nextLine();

            // MS949 인코딩으로 문자열을 바이트 배열로 변환
            byte[] byteArray = str.getBytes(Charset.forName("MS949"));

            // 바이트 배열 출력
            System.out.print("Byte array: ");
            for (byte b : byteArray) {
                System.out.printf("%02X ", b);
            }
        }        



        Scanner scan = new Scanner(System.in/* , "MS949" */);
        System.out.print("이름 입력>");
        String str = scan.nextLine();
        System.out.printf("이름 : %s\n", str);
        scan.close();

        /////
        try {
            

            byte[] ms949Bytes = str.getBytes("MS949");
            byte[] UTF_8Bytes = str.getBytes();

            System.out.printf("'%s' in UTF-8 encoding: ", str);
            for (byte b : UTF_8Bytes) {
                System.out.printf("%02X ", b);
            }
            System.out.println();

            System.out.printf("'%s' in MS949 encoding: ", str);
            for (byte b : ms949Bytes) {
                System.out.printf("%02X ", b);
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
