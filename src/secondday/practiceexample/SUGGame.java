package secondday.practiceexample;

import java.util.Scanner;

public class SUGGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

             System.out.println("----369게임----");
             System.out.println("마지막 숫자를 입력하시오.");
        int num = scanner.nextInt();
        int sug = 1;
        while (sug<=num){
            int a = (sug/10)%10; // 10의 자리숫자가 3,6,9인지 알아보는 방법
            int b = sug%10; // 1의 자리가 0,3,6,8인지 알아보는 방법
            if (num>100 || num<1){
                System.out.println("100 이상의 수는 입력 할 수 없습니다.");
                num = scanner.nextInt();
                continue;
            } else if ((a==3||a==6||a==9)&&b==0){
                System.out.println("짝 ");
            } else if (b==0){
                System.out.println(sug+" ");
            } else if((a==3||a==6||a==9)&&(b==3||b==6||b==9)){
                System.out.print("짝짝 ");
            } else if ((a==3||a==6||a==9)||(b==3||b==6||b==9)){
                System.out.print("짝 ");
            } else {
                System.out.print(sug+" ");
            }
            sug++;
        }
    }
}
