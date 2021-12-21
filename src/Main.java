import java.util.Scanner;

// 문제는 구분하기 위해 클래스에 Q + 문제번호를 넣었지만,
// 제출할 때는
// 반드시 public class Main으로 감싸고, main method로 실행해야한다.
// 안그러면 컴파일 에러가 발생한다.
// import 도 다 넣어야한다.
public class Main {

    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        //logic

        int answer = first + second;

        //output
        System.out.println(answer);
    }
}