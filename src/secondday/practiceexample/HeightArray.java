package secondday.practiceexample;

import java.util.Arrays;
import java.util.Scanner;

public class HeightArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("학생은 몇명인가요?");
        int student = scanner.nextInt();
        int[] arr = new int[student];
        for (int i = 0; i < student; i++) {
            System.out.println((i + 1) + "번째 학생 키 :");
            arr[i] = scanner.nextInt();
        }
        for (int j = 1; j < student; j++){
            for (int k = 0; k < student-j; k++){
                if (arr[k]>arr[k+1]){
                    int height =  arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = height;
                }
            }
        }
            //Arrays.sort(arr); // 구글링도 실력이라 했습니다.
            System.out.print(Arrays.toString(arr));
        }
    }