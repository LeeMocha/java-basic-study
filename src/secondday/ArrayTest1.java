package secondday;

import java.util.Arrays;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        System.out.println(arr); //배열명 출력
        System.out.println(Arrays.toString(arr)); //배열 데이터 출력
        System.out.println(Arrays.stream(arr).sum()); //배열 데이터 sum
    }
}