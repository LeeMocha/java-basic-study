package Firstday;

import java.util.Scanner;

public class OperatorTest5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" 정수를 입력하세요 (num):");
        int num = scan.nextInt();
        System.out.println("num: " + num);
        System.out.println("num++: " + num++);
        System.out.println("num: " + num);
        System.out.println("++num: " + ++num);
        System.out.println("num: " + num);
        System.out.println("num--: " + num--);
        System.out.println("num: " + num);
        System.out.println("--num: " + --num);
        System.out.println("num: " + num);
        // ++ or -- 는 정수 1 값만 증가 또는 감소 시킨다
        // 앞에오면 전위형 - 명령어보다 먼저 실행하여 값을 변경한 후에 명령어 프린트를 출력해준다
        // 뒤에오면 후위형 - 명령어보다 후에 실행하여 명령어 후에 값이 변경되어 저장된다
    }
}