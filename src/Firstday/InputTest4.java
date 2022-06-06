package firstday;

import java.util.Scanner;

public class InputTest4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        String sentence;

        System.out.println("---입력---");
        System.out.print("당신의 이름은 무엇입니까?:");
        name = input.next();
        input.nextLine(); //엔터를 제거하기위함
        System.out.print("당신이 가장 좋아하는 문장은 무엇입니까?:");
        sentence = input.nextLine();
        System.out.println("---출력---");
        System.out.println(name + "님이 가장 좋아하시는 문장은 '" + sentence + "'입니다.");

        // next() 띄어쓰기를 기준으로 입력을 받음
        // nextLine() 개행문자를 기준으로 입력을 받음
    }
}
