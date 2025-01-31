package basic.ctrl;

import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요>>>");
        
        // 정수값을 입력받아서 age 변수에 저장
        int age = sc.nextInt();

        /*
        * if (조건식) {
        *   조건식이 true일 때 수행될 명령문들...
        * } else {
        *   조건식이 false일 때 수행될 명령문들...
        * }
        * */

        if ( age > 18 ){
            // 조건식이 참일 때 수행될 명령문들...
            System.out.printf("입력하신 나이는 %d살 입니다.\n", age);
            System.out.println("당신은 성인입니다.");
            System.out.println("당신은 편의점에서 술을 살 수 있어요.");
        } else {
            // 조건식이 거짓일 때 수행될 명령문들...
            System.out.printf("입력하신 나이는 %d살 입니다.\n", age);
            System.out.println("당신은 성인 아닙니다.");
            System.out.println("당신은 편의점에서 술을 살 수 없어요.");
        }
        
        sc.close();
    }
}
