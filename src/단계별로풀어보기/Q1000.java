package 단계별로풀어보기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
public class Q1000 {

    public static void main(String[] args) throws IOException {
        // BufferedReader 활용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        System.out.println(a+b);
    }
}
