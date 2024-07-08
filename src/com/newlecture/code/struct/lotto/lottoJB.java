package com.newlecture.code.struct.lotto;

import java.util.Scanner;

public class lottoJB {
  public static void main(String[] args) {

    // final int MANUAL_MENU = 1;

    int[] lotto = new int[6];

    boolean isRun = true;

    while (isRun) {

      switch (inputMenu()) {
        case 1:
          genManual(lotto);
          break;
        case 2:
          genAuto(lotto);
          break;
        case 3:
          print(lotto);
          break;
        case 4:
          isRun = exit();
          break;
      }
    }
  }

  private static boolean exit() {
    System.out.println("종료하시겠습니까?(Y/N)>");
    Scanner sc = new Scanner(System.in);
    if (sc.nextLine().equals("Y")) {
      System.out.println("Bye~");

    }
    return false;

  }

  private static void print(int[] lotto) {
    System.out.println("[발권한 로또번호]\n");

    // 출력
    for (int i = 0; i < 6; i++) {
      System.out.print(lotto[i]);
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

  private static void genAuto(int[] lotto) {
    System.out.println("[자동 발권]\n");
    System.out.print("자동으로 발권한 번호>");

    // 랜덤으로 뽑기
    {
      for (int i = 0; i < 6; i++)
        lotto[i] = (int) (Math.random() * 45) + 1;

    }
    // 정렬
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5 - i; j++) {
        if (lotto[j] > lotto[j + 1]) {
          int temp = lotto[j];
          lotto[j] = lotto[j + 1];
          lotto[j + 1] = temp;
        }
      }
    }

    // 출력
    for (int i = 0; i < 6; i++) {
      System.out.print(lotto[i]);
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

  private static void genManual(int[] lotto) {
    while (true) {

      String manual = """
                              [수동 발권]

          ※1~45 숫자 범위에서 원하는 번호를 스페이스를 구분자로 6개 입력하세요. 숫자는 정렬되어 있지 않아도 상관없다※\n
                                      """;
      System.out.println(manual);
      System.out.print("번호>");
      Scanner sc = new Scanner(System.in);
      for (int i = 0; i < 6; i++) {
        lotto[i] = sc.nextInt();
      }
      sc.nextLine();

      // 정렬
      for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
          if (lotto[j] > lotto[j + 1]) {
            int temp = lotto[j];
            lotto[j] = lotto[j + 1];
            lotto[j + 1] = temp;
          }
        }
      }

      System.out.println("\n입력한 번호확인");
      for (int i = 0; i < 6; i++) {
        System.out.print(lotto[i]);
        if (i != 5)
          System.out.print(" ");
        else
          System.out.println();
      }

      System.out.println("\n위의 번호가 맞나요?(Y/N)");
      if (sc.nextLine().equals("Y"))
        return;
    }
  }

  private static int inputMenu() {
    System.out.println("""
        [로또 복권 프로그램]

        1. 수동 발권
        2. 자동 발권
        3. 발권 번호 조회
        4. 종료
        메뉴입력>
        """);

    Scanner scan = new Scanner(System.in);
    int menu = scan.nextInt();

    return menu;
  }

}