package secondday;

import java.util.Scanner;

public class WhileTest2 {
    public static void main(String[] args) {
        int coffee = 10;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("커피를 몇 잔 주문하시겠습니까?");
            int orderCoffee = scanner.nextInt();
            if(coffee < orderCoffee){
                System.out.println("ㅜㅜ.. 커피는 " +coffee+"잔 남았습니다.");
                continue;
            }
            System.out.println("커피 " + orderCoffee+"잔 나왔습니다.");
            coffee -= orderCoffee;
            if(coffee == 0){
                System.out.println("다 팔았다 ! 오늘 영업 끝!");
                break;
            }
        }
    }
}