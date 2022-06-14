package secondday.practiceexample;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        System.out.println("-----자판기 프로그램-----");
        System.out.println("금액 :");
        Scanner scanner = new Scanner(System.in);
        int cost = scanner.nextInt();
        while (true) {
            System.out.println("1)오렌지 주스 : 1500, 2)파워에이드: 1800원, 3)생수: 1000원 4)미선택");
            int drinks = scanner.nextInt();
            if (drinks == 4) {
                System.out.println("잔돈 반환 - 1000원: " + (cost / 1000) + "개 " + "500원: " + ((cost % 1000) / 500 + "개" + "100원: " + (cost % 500) / 100 + "개"));
                break;
            } else {
                switch (drinks) {
                    case 1:
                        if (cost < 1500) {
                            System.out.println("돈이 부족합니다. ㅠㅠ");
                        } else {
                            System.out.println("오렌지 주스를 주문하셨습니다.");
                            cost -= 1500;
                            System.out.println("남은 잔액: "+cost);
                        }
                    case 2:
                        if (cost < 1800) {
                            System.out.println("돈이 부족합니다. ㅠㅠ");
                        } else {
                            System.out.println("파워에이드를 주문하셨습니다.");
                            cost -= 1800;
                            System.out.println("남은 잔액: "+cost);
                        }
                    case 3:
                        if (cost < 1000) {
                            System.out.println("돈이 부족합니다.ㅠㅠ");
                        } else {
                            System.out.println("생수를 주문하셨습니다.");
                            cost -= 1000;
                            System.out.println("남은 잔액: "+cost);
                        }
                    default:
                        System.out.println("상품이 없습니다.");
                }
            }
        }
    }
}