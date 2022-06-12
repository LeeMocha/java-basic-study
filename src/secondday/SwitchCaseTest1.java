package secondday;

import java.util.Scanner;

public class SwitchCaseTest1 {
    public static void main(String[] args) {
        System.out.println("동물의 번호를 선택하세요.");
        System.out.println("1. 토끼");
        System.out.println("2. 고양이");
        System.out.println("3. 원숭이");
        System.out.println("4. 강아지");
        System.out.println("5. 사자");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num){
            case 1: System.out.println("깡총");break;
            case 2: System.out.println("야옹");break;
            case 3: System.out.println("우끼끼");break;
            case 4: System.out.println("멍멍");break;
            case 5: System.out.println("어흥");break;
            default: System.out.println("보기에 있는 숫자를 선택해주세요.");
        }
    }
}