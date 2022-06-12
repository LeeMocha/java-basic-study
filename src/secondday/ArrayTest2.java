package secondday;

import java.util.Arrays;

public class ArrayTest2 {
    public static void main(String[] args) {
        char arr[] = new char[3];
        arr[0] = 'a';
        arr[1] = 'b';
        arr[2] = 'c';
//        arr[3] = 'd'; //에러 발생 ~! 주석처리하고 실행해보세요.
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
    }
}
