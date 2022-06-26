package 단계별로풀어보기;

import java.util.Scanner;

public class Q2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int min = sc.nextInt();
        sc.close();

        if (min < 45) {
            h--;
            if (h < 0) {
                h = 23;
            }
            // 1 시간 마이너스 했으니, +60분해줌
            min = (60 + min - 45);
            System.out.println(h+" "+min);
        } else {
            System.out.println(h+" "+(min-45));
        }

    }
}
