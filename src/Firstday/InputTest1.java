package Firstday;

import java.io.IOException;

public class InputTest1 {
    public static void main(String[] args) throws IOException {
        int val, val2, val3;
        System.out.println("입력 : ");
        val = System.in.read();
        val2 = System.in.read();
        val3 = System.in.read();
        //문자 하나만 처리가능
        //System.in.read는 무조건 int타입의 변수로 받아줘야함
        System.out.println("입력 data : " + val);
        System.out.println("입력 data : " + val2);
        System.out.println("입력 data : " + val3);
    }
}
