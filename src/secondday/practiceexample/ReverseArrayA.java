package secondday.practiceexample;

import java.util.Scanner;

public class ReverseArrayA {
    public static void main(String[] args) {
        System.out.println("---- 배열 입력받은 반대로 출력하기 ----");
        System.out.println("숫자 5개 입력");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + "번째 숫자 :");
            arr[i] = scanner.nextInt();
        }
        System.out.println("거꾸로 숫자 출력하기");
        for (int i = (arr.length - 1); i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
