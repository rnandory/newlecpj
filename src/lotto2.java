import java.util.Scanner;

public class lotto2 {
    public static void main(String[] args) {
        // Lotto번호
        int[] nums = new int[6];

        boolean exit = false;
        while (!exit) {
            // 시작화면 출력, 매뉴입력받기
            int menu = printMainMenu();

            switch (menu) {
                // 1. 수동발권
                case 1:
                    nums = manualGenerateLotto();
                    break;

                // 2. 자동발권
                case 2:
                    nums = AutoGenerateLotto();
                    break;

                // 발권번호 조회
                case 3:
                    checkLotto(nums);
                    break;

                // 종료화면
                case 4:
                    exit = exit();

                default:
                    break;
            }
        }
    }

    static int printMainMenu() {
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
        int menu = Integer.parseInt(sc.nextLine());
        return menu;
    }

    static int[] manualGenerateLotto() {
        int[] nums = new int[6];
        boolean Exit = false;
        do {
            String manual = """
                                        [수동 발권]

                    ※1~45 숫자 범위에서 원하는 번호를 스페이스를 구분자로 6개 입력하세요. 숫자는 정렬되어 있지 않아도 상관없다※\n
                                                """;
            System.out.println(manual);
            System.out.print("번호>");

            // nums 수동입력받기
            nums = getLottoNums();

            // 정렬
            sort(nums);

            // 출력
            System.out.println("\n입력한 번호확인");
            print(nums);

            // 확인
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("\n위의 번호가 맞나요?(Y/N)");
                if (sc.nextLine().equals("Y")) {
                    Exit = true;
                }
            }
        } while (!Exit);
        return nums;
    }

    static int[] AutoGenerateLotto() {
        System.out.println("[자동 발권]\n");

        int[] nums = new int[6];
        // 랜덤으로 뽑기
        nums = autoLottoPicker();

        // 정렬
        sort(nums);

        // 출력
        System.out.print("자동으로 발권한 번호>");
        print(nums);

        // 화면 전환용 프롬프트
        pause();

        return nums;
    }

    static void checkLotto(int[] nums) {
        System.out.println("[발권한 로또번호]\n");

        // 출력
        print(nums);

        // 화면 전환용 프롬프트
        pause();
    }

    static int[] getLottoNums() {
        int[] nums = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            nums[i] = sc.nextInt();
        }
        sc.nextLine();
        return nums;
    }

    static boolean exit() {
        System.out.println("종료하시겠습니까?(Y/N)>");
        Scanner sc = new Scanner(System.in);
        if (sc.nextLine().equals("Y")) {
            System.out.println("Bye~");
            return true;
        } else
            return false;
    }

    static int[] autoLottoPicker() {
        int[] nums = new int[6];
        // 중복되지 않는 숫자 6개 추첨
        for (int i = 0; i < 6; i++) {
            // 이전에 뽑은 숫자와 중복되지 않는 숫자가 뽑힐 때까지 while반복
            boolean isUniq = true;
            do {
                // 추첨
                nums[i] = (int) (Math.random() * 45) + 1;
                // 중복검사
                for (int j = 0; j < i; j++) {
                    if (nums[j] == nums[i]) {
                        isUniq = false;
                        break;
                    }
                }
            } while (!isUniq);
        }
        return nums;
    }

    static void print(int[] nums) {
        for (int i = 0; i < 6; i++) {
            System.out.print(nums[i]);
            if (i != 5)
                System.out.print(" ");
            else
                System.out.println();
        }
    }

    static void pause() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n상위메뉴로 가려면 아무키나 누르세요.");
        sc.nextLine();
    }

    static void sort(int[] nums) {
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5 - i; j++)
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
    }
}