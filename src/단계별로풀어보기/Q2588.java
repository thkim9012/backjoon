package 단계별로풀어보기;


import java.util.Scanner;

//(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
public class Q2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        System.out.println(a * (b.charAt(2) - '0'));
        System.out.println(a * (b.charAt(1) - '0'));
        System.out.println(a * (b.charAt(0) - '0'));
        System.out.println(a * Integer.parseInt(b));
    }
}
