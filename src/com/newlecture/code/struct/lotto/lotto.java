package com.newlecture.code.struct.lotto;
import java.util.Scanner;

public class lotto {
    static int[] nums = new int[6];
    static int menu;
    public static void main(String[] args) {
        
        while (true) {
            // 시작화면 출력
            firstScreen();
        
            switch (menu) {
                // 1. 수동발권
                case 1: selfTicketing();
                break;
                   
                // 2. 자동발권
                case 2: automaticTicketing();
                break;

                // 발권번호 조회
                case 3: checkTicket();
                break;

                // 종료화면
                case 4: exit();
                break;
            }

        }
    }





    private static void exit() {
        
            System.out.println("종료하시겠습니까?(Y/N)>");
            Scanner sc = new Scanner(System.in);
            if (sc.nextLine().equals("Y")) {
                System.out.println("Bye~");
            }
        
    }





    private static void checkTicket()
        {
            System.out.println("[발권한 로또번호]\n");
            
            // 출력
            for (int i = 0; i < 6; i++) {
                System.out.print(nums[i]);
                if (i != 5)
                    System.out.print(" ");
                else
                    System.out.println();
            }

            // 화면 전환용 프롬프트
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("\n상위메뉴로 가려면 아무키나 누르세요.");
                sc.nextLine();
            }
        }

    //--------------------------------------------------
    private static void automaticTicketing()
        {
            System.out.println("[자동 발권]\n");
            System.out.print("자동으로 발권한 번호>");                    

            // 랜덤으로 뽑기
            {
                
                // 중복되지 않는 숫자 6개 추첨
                for (int i = 0; i < 6; i++)
                    // 매 추첨 시 이전에 추첨된 숫자와 중복되는지 검사해서 중복되면 while반복
                    while (true){
                        // 추첨
                        nums[i] = (int) (Math.random() * 45) + 1;                        
                        // 중복검사
                        boolean isUniq = true;
                        for (int j=0; j<i; j++) {
                            if (nums[j] == nums[i]) {
                                isUniq = false;
                                break;
                            }
                        }
                        if (isUniq)
                            break;
                    }
                            
                    int[] arr = new int[6];
                    int num = (int) (Math.random() * 45) + 1;
                    if(num==arr[i])
            }

            // 정렬
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5 - i; j++) {
                    if (nums[j] > nums[j + 1]) {
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
                }
            }

            // 출력
            for (int i = 0; i < 6; i++) {
                System.out.print(nums[i]);
                if (i != 5)
                    System.out.print(" ");
                else
                    System.out.println();
            }

            // 화면 전환용 프롬프트
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("\n상위메뉴로 가려면 아무키나 누르세요.");
                sc.nextLine();
            }                 
        }
    





    //  수동 발권--------------------------------------------
    private static void selfTicketing(){
        while (true) {
            String manual = """
                                        [수동 발권]

                    ※1~45 숫자 범위에서 원하는 번호를 스페이스를 구분자로 6개 입력하세요. 숫자는 정렬되어 있지 않아도 상관없다※\n
                                                """;
            System.out.println(manual);
            System.out.print("번호>");

            Scanner sc = new Scanner(System.in);

            // nums를 배열에 담아서
            for (int i = 0; i < 6; i++) nums[i] = sc.nextInt();
            sc.nextLine();

            // 정렬
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5 - i; j++) {
                    if (nums[j] > nums[j + 1]) {
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
                 }
                }
        
                        
        System.out.println("\n입력한 번호확인");
        for (int i = 0; i < 6; i++) {
            System.out.print(nums[i]);
            if (i != 5)
                System.out.print(" ");
            else
                System.out.println();
        }

        System.out.println("\n위의 번호가 맞나요?(Y/N)");
        if (sc.nextLine().equals("Y"))
            break;
        }
}


    //  초기 화면----------------------------------------------
    private static void firstScreen() {
            String mainView = """
                                        [로또 복권 프로그램]

                    1. 수동 발권
                    2. 자동 발권
                    3. 발권번호 조회
                    4. 종료
                                        """;
            System.out.println(mainView);
            System.out.print("메뉴입력>");

            Scanner sc = new Scanner(System.in);
            menu = Integer.parseInt(sc.nextLine());
        }
    }