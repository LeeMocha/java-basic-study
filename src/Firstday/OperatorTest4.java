package Firstday;

import java.util.Scanner;

public class OperatorTest4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" 정수를 입력하세요 (num1) : ");
        int num1 = scan.nextInt();
        System.out.println(" 정수를 입력하세요 (num2) : ");
        int num2 = scan.nextInt();
        System.out.println(
                "(num1 > num2) && (num1 == num2): "+((num1 > num2) && (num1 == num2)));
        // &&은 And의 뜻을 가지고 있어서 둘중 하나라도 거짓이면 거짓으로 나옴
        System.out.println(
                "(num1 > num2) && (num1 == num2): "+((num1 > num2) && (num1 == num2)));
        // 이 예제는 오타가 있는것 같음 위 예제와 식이 같다
        System.out.println(
                "(num1 != num2) || (num1 == num2): "+((num1 != num2) || (num1 == num2)));
        // 시프트+백슬레쉬로 ||를 칠 수 있다
        // 이건 or의 뜻을 가지고 있어 둘중 하나라도 참이면 참으로 나옴
    }
}
