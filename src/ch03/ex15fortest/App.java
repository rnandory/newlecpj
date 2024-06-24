package ch03.ex15fortest;

public class App {
    public static void main(String[] args) {
        /* // 1. for을 이용해서 숫자 1을 10개 출력하시오.
        for (int i=0; i<10; i++)
            System.out.printf("%d ", 1);
        
        System.out.println("---------------------------");

        // 2. for을 이용해서 숫자 1~10까지 10개 출력하시오.
        for (int i=0; i<10; i++)
            System.out.printf("%d ", i+1);
        
        System.out.println("---------------------------");

        // 3. for을 이용해서 숫자 10부터 1까지 출력하시오.
        for (int i=0; i<10; i++)
            System.out.printf("%d ", 10-i);
        
        System.out.println("---------------------------");

        // 4. for을 이용해서 3부터 7까지 5개 숫자를 출력하시오.
        for (int i=0; i<5; i++)
            System.out.printf("%d ", i+3);
        
        System.out.println("---------------------------");

        // 5. for을 이용해서 1을 9까지 숫자 중 홀수만 5개 출력하시오.
        // 1 3 5 7 9
        for (int i=0; i<5; i++) {
            System.out.printf("%d ", 2*i + 1);
        }            
        
        System.out.println("---------------------------"); */








        // 1~10까지 5번 반복
        // for (int i=0; i<5; i++) {
        //     for (int j=0; j<10; j++) {
        //         System.out.printf("%d ", j+1);
        //     }
        // }

        
        // 1~10 -0
        // 1~9  -1
        // 1~8
        // 1~7
        // 1~6 -4
        // for (int i=0; i<5; i++) {
        //     for (int j=0; j<10-i; j++) {
        //         System.out.printf("%d ", j+1);
        //     }
        //     System.out.println();
        // }








        // // 별 찍기
        // // *
        // // * *
        // // * * *
        // // * * * *
        // // * * * * *
        // for (int y=0; y<10; y++) {
        //     for (int x=0; x<y+1; x++)
        //         System.out.print("*");
        //     System.out.println();
        // }

        // // 별 찍기
        // // * * * * *
        // // * * * *
        // // * * *
        // // * *
        // // *
        // for (int y=0; y<10; y++) {
        //     for (int x=0; x<10-y; x++)
        //         System.out.print("*");
        //     System.out.println();
        // }

    
        // // 별 찍기
        // // * * * * * * * * * *
        // // * * * * * * * * *
        // // * * * * * * * *
        // // * * * * * * *
        // // * * * * * *
        // // * * * * * *
        // // * * * * * * *
        // // * * * * * * * *
        // // * * * * * * * * *
        // // * * * * * * * * * *
        // for (int y=0; y<10; y++) {
        //     for (int x=0; x<10; x++) {
        //         if (y>=x || y<=-x+9)
        //             System.out.print("*");
        //     }

        //     System.out.println();
        // }

        // 별 찍기
        // * * * * * *
        // * * * * * * *
        // * * * * * * * *
        // * * * * * * * * *
        // * * * * * * * * * *
        // * * * * * * * * * *
        // * * * * * * * * *
        // * * * * * * * *
        // * * * * * * *
        // * * * * * *
        for (int y=0; y<10; y++) {
            for (int x=0; x<10; x++) {
                if (y<=x || y>=-x+9)
                    System.out.print("★ ");
                else
                    System.out.print("　");
            }

            System.out.println();
        }
    }
}
