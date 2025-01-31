package basic.ctrl;

import java.util.Scanner;

public class Exam03 {
    public static void main(String[] args) {
        /*
        *  지하철 요금 계산기
        * 나이에 따라 지하철 요금을 계산해주세요.
        * 나이가
        * 0살 이상 ~ 7살 이하이면 요금은 0원입니다.
        * 8살 이상 ~ 13살 이하이면 요금은 1000원입니다.
        * 14살 이상 ~ 64살 이하이면 요금은 1500원입니다.
        * 65살 이상이면 요금은 0원입니다.
        * */

        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요>>>");

        int age = sc.nextInt();

        /*
        * if (조건식1) {
        *   조건식1이 true인 경우 수행될 명령문들...
        * } else if (조건식2) {
        *   조건식2가 true일 경우 수행될 명령문들...
        * } else if (조건식3) {
         *   조건식3가 true일 경우 수행될 명령문들...
         * } ...
         * ...
         * } else if (조건식n) {
         *  조건식n이 true일 경우 수행될 명령문들...
         * } else {
         *  위의 모든 조건식들이 false인 경우 수행될 명령문들...
         * }
        * */


        int money = 0;
        if( age >= 65 ){
            money = 0;
        } else if ( age >= 14 && age <= 64 ) {
            money = 1500;
        } else if ( age >= 8 && age <= 13 ) {
            money = 1000;
        } else if ( age <= 7 ) {
            money = 0;
            // 그냥 else money=0 으로 해두면 모두 거짓인 경우 0이 나온다.
        }
        System.out.printf("%d살의 지하철 요금은 %d원 입니다.\n", age, money);
        sc.close();
    }
}
