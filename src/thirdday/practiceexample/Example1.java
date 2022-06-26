package thirdday.practiceexample;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("2자리 정수를 입력하시오(10~99) :");
            int xx = scanner.nextInt();
            if (10>xx || xx>99){
                System.out.println("10~99 사이의 정수를 입력하십시오");
                continue;
            } else if (xx%11==0){
                System.out.println("10의 자리와 1의 자리 숫자가 같습니다.");
            } else {
                System.out.println("10의 자리와 1의 자리 숫자가 다릅니다.");
            }
            while (true) {
                System.out.println("계속 하시겠습니까? 1:예  2:아니오");
                int num = scanner.nextInt();
                if (num == 1) {
                    break;
                } else if (num == 2) {
                    System.out.println("종료하겠습니다");
                    return;
                } else {
                    System.out.println("보기에 있는 숫자만 쓰시오.");
                }
            }
        }
    }
}
