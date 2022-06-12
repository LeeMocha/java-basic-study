package secondday;

import java.util.Scanner;

public class IfTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("시험 합격점수를 입력하세요.");
        int limitScore = scanner.nextInt();

        System.out.println("시험 점수를 입력하세요.");
        int myScore = scanner.nextInt();

        if (limitScore > 100 || myScore > 100){
            System.out.println("점수는 100점을 넘을 수 없습니다.");
        } else if (myScore > limitScore) {
            System.out.println("합격하셨습니다.");
        } else {
            System.out.println("불합격하셨습니다.");
        }
    }
}