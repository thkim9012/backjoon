package 단계별로풀어보기;

import java.util.Scanner;

// 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다. 윤년이면 1, 아니면 0
public class Q2753 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        System.out.println(a % 4 == 0 && a % 100 != 0 ? 1 : a % 400 == 0 ? 1 : 0);

    }
}
