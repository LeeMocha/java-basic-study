package secondday;

import study.exampletutorial.포와와일문.WhileTest1;

import java.util.Scanner;

public class FindDecimals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------ 소수 구하기 프로그램 ------");
        System.out.println();
        while (true) {
            System.out.println("숫자를 입력하세요.");
            int num = scanner.nextInt();
            if (num % 2 == 0 || num == 1) {
                System.out.println(num + "은(는) 소수가 아닙니다.");
            } else if (num != 2 && num % 2 == 0) {
                System.out.println(num + "은(는 )소수가 아닙니다.");
            } else if (num != 3 && num % 3 == 0) {
                System.out.println(num + "은(는) 소수가 아닙니다.");
            } else if (num != 5 && num % 5 == 0) {
                System.out.println(num + "은(는) 소수가 아닙니다.");
            } else if (num != 7 && num % 7 == 0) {
                System.out.println(num + "은(는) 소수가 아닙니다.");
            } else {
                System.out.println(num + "은(는) 소수입니다");
            }
            System.out.println("계속 하시겠습니까? 1:예  2:아니오");
            int num2 = scanner.nextInt();
                if (num2 == 1) {
                    continue;
                } else if (num2 == 2) {
                    System.out.println("종료하겠습니다");
                    break;
                } else {
                    System.out.println("보기에 있는 숫자만 쓰시오.");
                    //바로 위 "계속 하시겠습니까?"로 못넘어가는게 아쉽다.
                }
            }
        }
    }