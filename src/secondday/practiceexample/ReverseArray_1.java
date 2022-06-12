package secondday.practiceexample;

import java.util.Scanner;

public class ReverseArray_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("---- 배열 입력받은 반대로 출력하기 ----");
        System.out.println("숫자 5개 입력");
        System.out.println("1번째 숫자: ");
        arr[4] = scanner.nextInt();
        System.out.println("2번째 숫자: ");
        arr[3] = scanner.nextInt();
        System.out.println("3번째 숫자: ");
        arr[2] = scanner.nextInt();
        System.out.println("4번째 숫자: ");
        arr[1] = scanner.nextInt();
        System.out.println("5번째 숫자: ");
        arr[0] = scanner.nextInt();
        System.out.println("꺼꾸로 숫자 출력하기");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
    }
}
