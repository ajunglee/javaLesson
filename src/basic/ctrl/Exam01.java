package basic.ctrl;

import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {

        // if 제어문(조건문)
        Scanner sc = new Scanner(System.in);
        
        // 사용자로부터 정수를 입력받아서 홀수인지 짝수인지 체크하여 출력
        System.out.print("정수를 입력하세요>>> ");
        
        // 기본값으로 홀수라고 저장함
        String output = "홀수";
        
        // 사용자가 키보드로부터 입력한 값이 number로 저장됨
        int number = sc.nextInt();

        /*
        * if 조건문의 첫번째 형식
        * if(조건식) {
        *   조건식의 결과가 true일때 실행될 명령문들...
        * }
        * */

        if( number % 2 == 0 ) {
            output = "짝수";
        }

        System.out.printf("입력값 %d는 %s입니다.\n", number, output);

        sc.close();
    }
}
