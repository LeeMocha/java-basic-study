package secondday;

import java.util.Arrays;

public class ArrayTest3 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        // 첫번째 칸에 'a', 두번째 칸에 'b', 세번째 칸에 'c' 네번째 칸에 'd'를 넣어보자.
        arr[0] = 'a';
        arr[1] = 'b';
        arr[2] = 'c';
        arr[3] = 'd';
        System.out.println(Arrays.toString(arr));
        System.out.println((char)arr[0]);
        System.out.println((char)arr[1]);
        System.out.println((char)arr[2]);
        System.out.println((char)arr[3]);
        System.out.println(arr.length); //배열의 길이는 배열이름.length
    }
}