package thirdday.practiceexample;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        System.out.println("첫번째 원의 중심과 반지름 입력>> ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int a1 = scanner.nextInt();
        double r = scanner.nextDouble();
        System.out.println("두번째 원의 중심과 반지름 입력>>");
        int b = scanner.nextInt();
        int b1 = scanner.nextInt();
        double r1 = scanner.nextDouble();
        double x = Math.sqrt((a-b)*(a-b)+(a1-b1)*(a1-b1));
        if (x <= r+r1) {
            System.out.println("두 원은 서로 겹친다.");
        } else System.out.println("두 원은 서로 안겹친다.");
    }
}
