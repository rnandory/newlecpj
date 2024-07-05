import java.util.Random;
import java.util.Scanner;

public class lotto3 {
   
   static String YES = "Y";
   static String NO = "N";
   static int[] results = new int[6];
   
   public static void main(String[] args) {
      
      boolean flag = true;
      
      String view = """
            [로또 복권 프로그램]
            
            1. 수동 발권
            2. 자동 발권
            3. 발권 번호 조회
            4. 종료
            메뉴입력>
            """;
      while(flag) {

         System.out.println(view);
         
         Scanner scan = new Scanner(System.in);
         int menu = scan.nextInt();
         
         switch (menu) {
            case 1: {
               results = manual(results);
               break;
            }
            case 2: {
               results = auto();
               break;
            }
            case 3: {
               if(results != null) result(results);
               break;
            }
            case 4: {
               flag = exit();
               break;
            }
         }
      }
   }
   
   static void result(int[] nums) {
      String view = """
            [발권한 로또번호]
            """;
      
      String control = """
            상위메뉴로 가려면 아무키나 누르세요.
            """;
      
      System.out.println(view);
      print(nums);
      
   }

   static int[] manual(int[] nums){
      
      String view = """
            [수동 발권]
            
            ※1~45 숫자 범위에서 원하는 번호를 스페이스를 구분자로 6개 입력하세요. 숫자는 정렬되어 있지 않아도 상관없다※
            번호>
            """;
      
      String resultView = """
            입력한 번호확인
            """;
      
      String validateView = """
            위의 번호가 맞나요?(Y/N)>
            """;
         
      System.out.print(view);
      
      // 숫자 6개 입력 및 처리
      Scanner scan = new Scanner(System.in);
      String[] numStrs = scan.nextLine().split(" ");
      int[] nums_ = new int[numStrs.length];
      
      for(int i = 0 ; i < nums_.length ; i++) {
         nums_[i] = Integer.parseInt(numStrs[i]);
      }
      
      // 정렬 후 출력
      System.out.println(resultView);
      nums_ = sort(nums_);
      print(nums_);
      
      // 번호 맞는지 확인
      System.out.println(validateView);
      Scanner scan2 = new Scanner(System.in);
      String result = scan2.next();
      
      // 번호 유효성 검사
      if(YES.equalsIgnoreCase(result)) return nums_;
      
      return manual(nums);
   }
   
   static int[] sort(int[] nums) {   
      
      for(int i = 0 ; i < nums.length ; i++) {
         for(int j = i+1 ; j < nums.length ; j++) {
            if(nums[i] >= nums[j]) {
               int temp = nums[i];
               nums[i] = nums[j];
               nums[j] = temp;   
            }         
         }
      }
      return nums;
   }

   static int[] auto() {
      
      int[] ranNums = new int[6];
      
      String view = """
            [자동 발권]
            
            자동으로 발권한 번호>
            """;
      
      String view2 = """
            상위메뉴로 가려면 아무키나 누르세요.
            """;
      
      Scanner scan = new Scanner(System.in);
      System.out.print(view);
      
      for(int i = 0 ; i < 6 ; i++) {
         
         Random random = new Random();
         ranNums[i] = random.nextInt(45) + 1;
         
         // 중복 제거
         for(int j = 0 ; j < i ; j++) {
            if(ranNums[i] == ranNums[j]) {
               i--;
               break;
            }
         }
      }

      // 정렬 및 출력
      ranNums = sort(ranNums);
      print(ranNums);

      System.out.println("\n" + view2);
      Scanner scan2 = new Scanner(System.in);
      
      // 종료하기 위한 아무키 입력
      scan2.hasNext();
      
      return ranNums;
   }

   
   static boolean exit() {
      
      boolean flag = true;
      
      String view = """
            종료하시겠습니까?(Y/N)>(엔터)
            """;
      
      String view2 = """
            Bye~
            """;
      
      System.out.println(view);
      Scanner scan3 = new Scanner(System.in);
      String result = scan3.next();
      
      if(YES.equalsIgnoreCase(result)) {
         System.out.println(view2);
         return flag = false;
      }
      else return flag;
   }

   
   static void print(int[] nums) {
      
      for(int i = 0 ; i < nums.length ; i++) {
         if(i == nums.length - 1) {
            System.out.println(nums[i]);
            break;
         }
         System.out.print(nums[i] + ", ");      
      }
   }
   
   static boolean validateNumbers(int[] numbers) {
        if (numbers.length != 6) {
            return false;
        }

        for (int number : numbers) {
            if (number < 1 || number > 45) {
                return false;
            }
        }

        return true;
    }

}