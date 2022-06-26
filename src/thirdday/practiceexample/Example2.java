package thirdday.practiceexample;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("3개의 정수를 입력하시오>> ");
        int arr[] = new int[3];
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        arr[2] = scanner.nextInt();

        for (int j = 1; j < 3; j++) {
            for (int k = 0; k < 3 - j; k++) {
                if (arr[k] > arr[k + 1]) {
                    int height = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = height;

                }
            }
        }
        if (arr[0] + arr[1] > arr[2]) {
            System.out.println("삼각형이 됩니다.");
        } else {
            System.out.println("삼각형이 안됩니다.");
        }
    }
}