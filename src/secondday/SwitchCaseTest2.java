package secondday;

import java.util.Scanner;

public class SwitchCaseTest2 {
    public static void main(String[] args) {
        System.out.println("몇월인가요?");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        String[] monthArr = {"January","February","March","April",
                "May","June","July","August","September",
                "October","November","December"};
        if(month < 1 || month > monthArr.length){
            System.out.println("Invalid month");
        } else {
            System.out.println(monthArr[month-1]);
        }
    }
}