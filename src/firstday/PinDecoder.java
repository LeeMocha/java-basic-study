package firstday;

import java.util.Scanner;

public class PinDecoder {
    public static void main(String[] args) {
        Scanner Mocha = new Scanner(System.in);
        System.out.println("비밀번호 (*****) : ");
        int password = Mocha.nextInt();
        System.out.println("딸 생일 (MMDD) : ");
        int daughterB = Mocha.nextInt();
        int daughterBD = (daughterB%100);
        int boyfriendB = (password-(daughterB+daughterBD))/7;
        System.out.println("남자친구 생일 (MMDD) : ");
        System.out.println(boyfriendB);
    }
}
