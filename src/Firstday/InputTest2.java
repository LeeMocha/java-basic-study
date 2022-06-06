package Firstday;

import java.io.IOException;

public class InputTest2 {
    public static void main(String[] args) throws IOException {
        System.out.print("문자 입력: ");
        int num = System.in.read();
        //System.in.read() 는 입력된 값을 아스키코드 문자에 해당하는 10진법 값으로 저장함
        System.out.println("==== 출 력 ====");
        System.out.println("입력하신 문자 :" + (char) num);
        //char는 num의 값을 문자값 그대로 보여주기 위해 넣은 명령어
        //char를 빼면 num의 값의 10진법 그대로 값이 나옴
        System.out.println("소문자로 변환 :" + (char) (num + 32));

    }
}