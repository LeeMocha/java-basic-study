package Firstday;

import java.util.Scanner;

public class InputTest3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* input 자리는 객체자리, new는 이 InputTest3 내부에 없는 java.Uril에 있는
           scanner class에 input 객체를 대입하라 라는 것
           (System.in)은 입력받은 값을 자바 표준 입출력 값으로 저장하라는 뜻
         */
        int  age;
        String name;

        System.out.println("---입력---");
        System.out.println("이름 입력: ");
        name = input.next();
        //input 자리에 다른 객체를 쓰면 scanner로 값이 안넘어가짐
        //next 는 공백 문자열 전까지의 문자들만 인식하여 값으로 지정
        //nextline 은 한 줄의 영역 모두 인식하여 값으로 지정
        System.out.println("나이: ");
        age = input.nextInt();
        //nextInt 는 가장 먼저 나오는 정수만 인식하여 값으로 지정
        System.out.println("---출력---");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }
}
