package firstday;

import java.util.Scanner;

public class OperatorTest1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" 두개의 정수를 입력하세요 :");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("더한 결과 : " + (num1+num2));
        System.out.println("뺀 결과 : " + (num1-num2));
        System.out.println("곱한 결과 : " + (num1*num2));
        System.out.println("나눈 결과 : " + (num1/num2));
        System.out.println("나머지 : " + (num1%num2));
    }
}
