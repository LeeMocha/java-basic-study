package firstday;

import java.util.Scanner;

public class BMICalulator {
    public static void main(String[] args) {
        Scanner Mocha = new Scanner(System.in);

        System.out.println("-----BMI 계산기-----");
        System.out.println("이름 : ");
        String name = Mocha.next();
        System.out.println("키 : ");
        int height = Mocha.nextInt();
        System.out.println("몸무게 : ");
        int weight = Mocha.nextInt();

        double bmi = weight/(((double)height/100)*((double)height/100));
        System.out.println("BMI : ");
        System.out.println(bmi);
        System.out.println((name)+"님의 BMI는 "+(bmi)+" 입니다.");
    }
}
