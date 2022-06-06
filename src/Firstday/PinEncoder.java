package Firstday;

import java.util.Scanner;

public class PinEncoder {
    public static void main(String[] args) {
        Scanner Mocha = new Scanner(System.in);
        System.out.println("-----암호 구현하기-----");
        System.out.println("남친 생일(MMDD): ");
        int boyfriendB = Mocha.nextInt();
        System.out.println("내 생일(MMDD): ");
        int myB = Mocha.nextInt();
        int password = (boyfriendB*8)-boyfriendB+myB+(myB/100)+(boyfriendB%100);
        System.out.println("암호: "+password);
        System.out.println("--------------------");
    }
}
