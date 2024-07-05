import java.util.Scanner;

public class study1 {
    public static void main(String[] args) {
        while (true) {

            // 메뉴화면
            // 메뉴화면 출력
            int menu;
            {
                String mainMenu = """
                                            [  말하기 메뉴를 선택하세요 ]

                        1. 좋아하는 사람 말하기
                        2. 좋아하는 숫자 말하기
                        3. 좋아하는 숫자 범위 말하기
                        4. 좋아하는 숫자 범위와 특별히 좋아하는 숫자 말하기
                        5. 좋아하는 숫자 무작위로 말하기
                        6. 좋아하는 영화정보 말하기
                                            """;
                System.out.println(mainMenu);

                // 메뉴입력
                System.out.print("메뉴>");
                Scanner sc = new Scanner(System.in);
                menu = Integer.parseInt(sc.nextLine());
            }

            switch (menu) {
                // 좋아하는 사람
                case 1: {
                    String favoritePeople;
                    System.out.println("당신이 좋아하는 사람의 이름을 입력하세요.");
                    System.out.print("이름>");
                    Scanner sc = new Scanner(System.in);
                    favoritePeople = sc.nextLine();

                    System.out.printf("우아 \"%s\"님도 당신을 좋아할 겁니다.\n", favoritePeople);
                    System.out.println();
                }
                    break;
                // 좋아하는 숫자
                case 2: {
                    int favoriteNum;
                    System.out.println("당신이 좋아하는 숫자를 입력해보세요.");
                    System.out.print("번호>");
                    Scanner sc = new Scanner(System.in);
                    favoriteNum = Integer.parseInt(sc.nextLine());

                    System.out.printf("우아 당신은 %s를 좋아하시는군요.\n", (favoriteNum % 2 == 0 ? "짝수" : "홀수"));
                    System.out.println();
                }
                    break;
                // 좋아하는 숫자범위
                case 3: {
                    int favoriteNumInitial;
                    int favoriteNumFinal;

                    System.out.println("당신이 좋아하는 숫자의 범위를 입력해주세요. 스페이스를 구분자로 넣어주세요");
                    System.out.print("숫자범위(min sp max)>");

                    Scanner sc = new Scanner(System.in);
                    favoriteNumInitial = Integer.parseInt(sc.next());
                    favoriteNumFinal = Integer.parseInt(sc.next());

                    StringBuilder numList = new StringBuilder();
                    int index = favoriteNumInitial;
                    while (index <= favoriteNumFinal) {
                        numList.append(index);
                        if (index != favoriteNumFinal)
                            numList.append(",");
                        index++;
                    }

                    System.out.printf("당신이 좋아하는 숫자는 %s이군요\n", numList.toString());
                    System.out.println();
                }
                    break;
                // 좋아하는 숫자범위와 특별히 좋아하는 숫자
                case 4: {
                    int favoriteNumInitial;
                    int favoriteNumFinal;
                    int favoriteNum;

                    System.out.println("당신이 좋아하는 숫자의 범위와 특별히 좋아하는 숫자를 추가로 입력해주세요. 스페이스를 구분자로 넣어주세요");
                    System.out.print("숫자범위(min sp max)>");

                    Scanner sc = new Scanner(System.in);
                    favoriteNumInitial = Integer.parseInt(sc.next());
                    favoriteNumFinal = Integer.parseInt(sc.next());
                    sc.nextLine();
                    
                    System.out.print("특별히 좋아하는 숫자>");
                    favoriteNum = Integer.parseInt(sc.nextLine());

                    StringBuilder numList = new StringBuilder();
                    int index = favoriteNumInitial;
                    while (index <= favoriteNumFinal) {
                        if (index == favoriteNum) {
                            numList.append("[");
                            numList.append(index);
                            numList.append("]");
                        }
                        else
                            numList.append(index);

                        if (index != favoriteNumFinal)
                            numList.append(",");
                        index++;
                    }

                    System.out.printf("당신이 좋아하는 숫자는 %s이군요\n", numList.toString());
                    System.out.println("특별히 좋아하는 숫자를 대괄호로 감싸봣습니다.^^");
                    System.out.println();
                }
                    break;
                default:
                    break;
            }
        }
    }
}
