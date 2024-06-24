package ch03.ex03print;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        // // Consoleoutputstream cos = new Consoleoutputstream();
        // PrintStream out = new PrintStream(System.out);
        // System.out.write(50);
        // System.out.print(50);
        // System.out.println(80);
        // // System.out.print("ab\bcd\tef\\\"g");

        // int kor1;
        // int kor2;
        // int kor3;
        // int total;
        // double avg;

        // {
        // int kor;
        // int eng;
        // int math;

        // System.out.println("┌──────────────────┐");
        // System.out.println("│ 성적 출력 │");
        // System.out.println("└──────────────────┘");

        // FileInputStream fis = new FileInputStream("res/data.csv");
        // Scanner scan = new Scanner(fis);

        // String[] caption = scan.nextLine().split(",");
        // System.out.printf("%-4s\t%-4s\t%-4s\t%-4s\n", caption[0], caption[1],
        // caption[2], caption[3]);

        // while (scan.hasNextLine()) {
        // String line = scan.nextLine();
        // String[] tokens = line.split(",");

        // String name = tokens[0];

        // // tokens값이 숫자가 아니라면 초기값을 0으로
        // if (!isNumeric(tokens[1])) {
        // kor = 0;
        // } else
        // kor = Integer.parseInt(tokens[1]);

        // // kor값이 유효범위에 있지 않다면 0
        // if ((!(0 <= kor && kor <= 100)))
        // kor = 0;

        // // tokens값이 숫자가 아니라면 초기값을 0으로
        // if (!isNumeric(tokens[2]))
        // eng = 0;
        // else
        // eng = Integer.parseInt(tokens[2]);

        // // eng값이 유효범위에 있지 않다면 0
        // if (!(0 <= eng && eng <= 100))
        // eng = 0;

        // // tokens값이 숫자가 아니라면 초기값을 0으로
        // if (!isNumeric(tokens[3]))
        // math = 0;
        // else
        // math = Integer.parseInt(tokens[3]);

        // // math값이 유효범위에 있지 않다면 0
        // if (!(0 <= math && math <= 100))
        // math = 0;

        // System.out.printf("%-4s\t%-4d\t%-4d\t%-4d\n", name, kor, eng, math);
        // }
        // scan.close();
        // fis.close();
        // }

        // /*
        // * 문제3
        // * 학생 성적의 grade를 채점하시오.
        // * 90 이상 : A, 80이상 : B, 70이상 : C,,,,
        // */
        // {
        // System.out.println("┌──────────────────┐");
        // System.out.println("│ 성적 출력 │");
        // System.out.println("└──────────────────┘");

        // FileInputStream fis = new FileInputStream("res/data.csv");
        // Scanner scan = new Scanner(fis);

        // // String[] caption = scan.nextLine().split(",");
        // // System.out.printf("%-4s\t%-4s\t%-4s\t%-4s\n", caption[0], caption[1],
        // caption[2], caption[3]);

        // // 첫 줄 버리기 캡션
        // scan.nextLine();
        // // 캡션
        // System.out.printf("%-4s\t%-4s\t%-4s\t%-4s\t%-4s\t%-4s\t%-4s\n", "이름", "국어",
        // "영어", "수학", "총점", "평균", "학점");

        // while (scan.hasNextLine()) {
        // int kor;
        // int eng;
        // int math;
        // int total;
        // double avg;
        // String grade;

        // String line = scan.nextLine();
        // String[] tokens = line.split(",");

        // String name = tokens[0];

        // // tokens값이 숫자가 아니라면 초기값을 0으로
        // if (!isNumeric(tokens[1])) {
        // kor = 0;
        // } else
        // kor = Integer.parseInt(tokens[1]);

        // // kor값이 유효범위에 있지 않다면 0
        // if ((!(0 <= kor && kor <= 100)))
        // kor = 0;

        // // tokens값이 숫자가 아니라면 초기값을 0으로
        // if (!isNumeric(tokens[2]))
        // eng = 0;
        // else
        // eng = Integer.parseInt(tokens[2]);

        // // eng값이 유효범위에 있지 않다면 0
        // if (!(0 <= eng && eng <= 100))
        // eng = 0;

        // // tokens값이 숫자가 아니라면 초기값을 0으로
        // if (!isNumeric(tokens[3]))
        // math = 0;
        // else
        // math = Integer.parseInt(tokens[3]);

        // // math값이 유효범위에 있지 않다면 0
        // if (!(0 <= math && math <= 100))
        // math = 0;

        // // total avg 계산
        // total = kor + eng + math;
        // avg = total/3.0;

        // // grade 계산
        // grade = "F";
        // if (70 <= avg)
        // grade = "C";
        // if (80 <= avg)
        // grade = "B";
        // if (90 <= avg)
        // grade = "A";

        // System.out.printf("%-4s\t%-4d\t%-4d\t%-4d\t%-4d\t%-5.2f\t%-4s\n", name, kor,
        // eng, math, total, avg, grade);
        // }
        // scan.close();
        // fis.close();
        // }

        /*
         * 문제3
         * 학생 성적의 grade를 채점하시오.
         * 90 이상 : A, 80이상 : B, 70이상 : C,,,,
         */

        // 메뉴 - 작업 - 메뉴 ... 메뉴 - 종료
        EXIT_LOOP: 
        while (true) {
            // 화면 지우고
            clear();

            // intro
            int menu;
            {
                // 메뉴화면 출력
                String menu_view = """
                            ┌───────────────────────────────┐
                            │            성적관리           │
                            └───────────────────────────────┘

                            1. 목록보기
                            2. 성적추가
                            3. 성적로드
                            4. 성적저장
                            5. 종료
                        """;

                System.out.print(menu_view);

                // 메뉴 입력받기
                Scanner scan = new Scanner(System.in);
                System.out.print("메뉴번호를 입력하세요 >_");
                menu = Integer.parseInt(scan.nextLine());
                //System.out.println(menu);
            }

            switch (menu) {
                case 2: // 성적추가
                // 화면 지우고
                clear();
                // 성적추가
                {
                    System.out.println("┌──────────────────────────────────────────────────┐");
                    System.out.println("│                     성적 추가                    │");
                    System.out.println("└──────────────────────────────────────────────────┘");

                    // 파일출력
                    FileOutputStream fos = new FileOutputStream("res/data.csv", true);
                    PrintStream ps = new PrintStream(fos, true/* , StandardCharsets.UTF_8.name() */);

                    Scanner sc = new Scanner(System.in, "MS949");

                    String name;
                    int kor = 0;
                    int eng;
                    int math;

                    System.out.print("이름 > ");
                    name = sc.nextLine();

                    String input;
                    // 국어점수 입력받기
                    // do {
                    //     System.out.print("국어점수 > ");
                    //     input = sc.nextLine();
                    //     // input이 숫자가 아니면
                    //     if (!isNumeric(input))
                    //         System.out.println("숫자를 입력하세요.");
                    //     // input이 유효범위가 아니면
                    //     else if (!(0 <= Integer.parseInt(input) && Integer.parseInt(input) <= 100))
                    //         System.out.println("유효범위가 아닙니다.");
                    //     // input이 유효범위 숫자이면 int로 파싱해서 kor에 대입
                    //     else
                    //         kor = Integer.parseInt(input);
                    // // 올바른 값이 아니면 반복
                    // } while (!isNumeric(input) || !(0 <= Integer.parseInt(input) && Integer.parseInt(input) <= 100));
                    do {
                        System.out.print("국어점수 > ");
                        kor = Integer.parseInt(sc.nextLine());

                        if (!(0<=kor && kor<=100))
                            System.out.println("성적은 0~100까지만 입력할 수 있습니다.");
                    }
                    while (!(0<=kor && kor<=100));


                    System.out.print("영어점수 > ");
                    eng = Integer.parseInt(sc.nextLine());

                    System.out.print("수학점수 > ");
                    math = Integer.parseInt(sc.nextLine());

                    // data.csv에 추가할 라인
                    // 파일 출력
                    ps.printf("\n%s,%d,%d,%d", name, kor, eng, math);
                    fos.close();
                    ps.close();

                    System.out.println("성적 추가 완료");
                }
                // 화면전환용 임시 프롬프트
                {
                    System.out.println("────────────────────────────────────────────────────");
                    System.out.println("Press any key to continue>");

                    Scanner scan = new Scanner(System.in);
                    scan.nextLine();
                }
                    break;
                
                case 3:// 성적로드
                // 화면 지우고
                clear(); 
                {
                    System.out.println("성적로드 메뉴");
                }
                // 화면전환용 임시 프롬프트
                {
                    System.out.println("────────────────────────────────────────────────────");
                    System.out.println("Press any key to continue>");

                    Scanner scan = new Scanner(System.in);
                    scan.nextLine();
                }
                    break;

                
                case 4:// 성적저장
                // 화면 지우고
                clear();
                {
                    System.out.println("성적저장 메뉴");
                }
                // 화면전환용 임시 프롬프트
                {
                    System.out.println("────────────────────────────────────────────────────");
                    System.out.println("Press any key to continue>");

                    Scanner scan = new Scanner(System.in);
                    scan.nextLine();
                }
                    break;
                
                case 5:// 종료
                // 화면 지우고
                clear();
                {
                    System.out.println("종료");
                    //return;
                    //System.exit(0); // 강제종료
                }                
                    break EXIT_LOOP;

                
                case 1:// 목록보기
                {                  
                    // 페이지
                    int page = 1;
                    int postPerPage = 6;
                    
                    page_menu:
                    while (true)
                    {
                        //화면 지우고
                        clear();
                        FileInputStream fis = new FileInputStream("res/data.csv");
                        Scanner scan = new Scanner(fis);
                        {
                            System.out.printf("%d page\n", page);
                            System.out.println("┌──────────────────────────────────────────────────┐");
                            System.out.println("│                     성적 목록                    │");
                            System.out.println("└──────────────────────────────────────────────────┘");

                            // String[] caption = scan.nextLine().split(",");
                            // System.out.printf("%-4s\t%-4s\t%-4s\t%-4s\n", caption[0], caption[1],
                            // caption[2], caption[3]);

                            // 컬럼명 한줄 버리기                            
                            scan.nextLine();

                            // 캡션 출력
                            System.out.printf("%-4s\t%-4s\t%-4s\t%-4s\t%-4s\t%-4s\t%-4s\n", "이름", "국어", "영어", "수학",
                                    "총점", "평균",
                                    "학점");
                        }
                        // 현재 페이지에 이전 라인들 읽어서 버리기
                        {
                            // 버릴 라인의 수 = (page - 1) * (한 페이지에 보여지는 글의 개수)

                            //버릴 라인만큼 반복
                            for (int i = 0; scan.hasNextLine() && i < (page - 1) * postPerPage; i++) {
                                scan.nextLine();
                            }                            
                        }

                        // 파일에서 한 줄씩 읽어서 화면출력
                        {                         
                            // postPerPage만큼 라인출력 반복
                            for (int i = 0; scan.hasNextLine() && i < postPerPage; i++) {
                                String line = scan.nextLine();
                                String[] tokens = line.split(",");

                                int kor;
                                int eng;
                                int math;
                                int total;
                                double avg;
                                String grade;

                                String name = tokens[0];

                                // kor
                                // tokens값이 숫자가 아니라면 초기값을 0으로
                                if (!isNumeric(tokens[1])) {
                                    kor = 0;
                                } else
                                    kor = Integer.parseInt(tokens[1]);

                                // kor값이 유효범위에 있지 않다면 0
                                if ((!(0 <= kor && kor <= 100)))
                                    kor = 0;

                                // eng
                                // tokens값이 숫자가 아니라면 초기값을 0으로
                                if (!isNumeric(tokens[2]))
                                    eng = 0;
                                else
                                    eng = Integer.parseInt(tokens[2]);

                                // eng값이 유효범위에 있지 않다면 0
                                if (!(0 <= eng && eng <= 100))
                                    eng = 0;

                                // math
                                // tokens값이 숫자가 아니라면 초기값을 0으로
                                if (!isNumeric(tokens[3]))
                                    math = 0;
                                else
                                    math = Integer.parseInt(tokens[3]);

                                // math값이 유효범위에 있지 않다면 0
                                if (!(0 <= math && math <= 100))
                                    math = 0;

                                // total avg 계산
                                total = kor + eng + math;
                                avg = total / 3.0;

                                // grade 계산
                                if (90 <= avg)
                                    grade = "A";
                                else if (80 <= avg)
                                    grade = "B";
                                else if (70 <= avg)
                                    grade = "C";
                                else
                                    grade = "F";

                                System.out.printf("%-4s\t%-4d\t%-4d\t%-4d\t%-4d\t%-5.2f\t%-4s\n", name, kor, eng, math,
                                        total,
                                        avg,
                                        grade);
                            } //for                                    
                            

                            // // 화면전환용 임시 프롬프트
                            // {
                            //     System.out.println("────────────────────────────────────────────────────");
                            //     System.out.println("Press any key to continue>");
                                
                            //     Scanner sc = new Scanner(System.in);                                        
                            //     scan.nextLine();
                            // }
                                    
                        } //목록출력 지역블록

                        // -1. 이전페이지
                        // 1. page지정해서 이동
                        // 2. 메인메뉴로
                        {
                            Scanner sc = new Scanner(System.in);
                            System.out.println("-1 : 이전페이지");
                            System.out.println("1 : 페이지 이동");
                            System.out.println("2 : 이전 메뉴");
                            System.out.print("메뉴번호를 입력하세요.>_");
                            int page_menu = Integer.parseInt(sc.nextLine());                        
                            
                            switch (page_menu) {                                
                                case -1:// 이전페이지
                                    page = page==1?1:page-1;    
                                    break;
                                case 1:// page지정해서 이동
                                {
                                    System.out.print("이동할 페이지 >_");
                                    page = Integer.parseInt(sc.nextLine());
                                    System.out.println("입력받은 페이지 : " + page);
                                }
                                    break;
                                case 2:// 메인메뉴로
                                    break page_menu;                            
                                default:// 유효하지 않은 메뉴입력
                                {
                                    System.out.println("유효하지 않은 입력.");
                                    // 화면전환용 임시 프롬프트
                                    {
                                        System.out.println("────────────────────────────────────────────────────");
                                        System.out.println("Press any key to continue>");                                        
                                        sc.nextLine();
                                    }
                                }                                    
                            }
                        }// 페이지메뉴 지역블록
                        fis.close();
                        scan.close();
                    } // while 전체화면출력
                } //case1 목록보기
                    break;
                
                default:
                {
                    System.out.println("오류 : 1~5까지의 값만 입력할 수 있습니다.");
                    // 화면전환용 임시 프롬프트
                    {
                        System.out.println("────────────────────────────────────────────────────");
                        System.out.println("Press any key to continue>");

                        Scanner sc = new Scanner(System.in);
                        sc.nextLine();
                    }
                }   
                    
            }
        }

        /*
         * System.out.println("┌──────────────────┐");
         * System.out.println("│     성적 입력    │");
         * System.out.println("└──────────────────┘");
         * 
         * Scanner scan = new Scanner(System.in);
         * System.out.print("kor1>");
         * kor1 = scan1.nextInt();
         * System.out.print("kor2>");
         * kor2 = scan1.nextInt();
         * System.out.print("kor3>");
         * kor3 = scan1.nextInt();
         */

        // scan.close();

        // System.out.printf("1:%d\n2:%10d\n3:%-10d",3, 3, 3);
        // System.out.printf("%5.2f\n", 36.66666666);

        // FileOutputStream fos = new FileOutputStream("res/data.txt");
        // PrintStream fout = new PrintStream(fos, true, Charset.forName("utf-8"));
        // fout.printf("%d %d %d", kor1, kor2, kor3);

        // fout.close();
        // fos.close();

        // System.out.println();
        // System.out.println("저장이 완료되었습니다.");

    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void clear() {
        try {
            String operatingSystem = System.getProperty("os.name");
            if (operatingSystem.contains("Windows")) {
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
