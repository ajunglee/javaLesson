package basic.loops;

import java.util.Scanner;

public class Exam03 {
    public static void main(String[] args) {

        // for문은 반복횟수가 비교적 명확할 때 사용한다.
//        for( 초기식; 조건식; 증감식 ) {
//        }
        int total = 0;
        for ( int i=0; i<=10; i++ ) {
            System.out.printf("i = %d\n", i);
            total += i;
        }
        System.out.printf("total = %d\n", total);
//        System.out.printf("i = %d\n", i); for문 안에 있는 초기식, 조건식 등은 밖에서 선언할 수 없다.
        //초기식을 밖에서 초기화했으면 for안에 안넣고 생략가능하다. but ;세미콜론은 넣어줘야함.

        // 1부터 99까지 홀수의 합 구하기

        total = 0;
        for( int i=1; i<100; i+=2){
            total += i;
        }
        System.out.printf("total = %d\n", total);

        //ASCII TABLE 참고
        String str = "HELLO";//01234 순서
        char ch = str.charAt(4); // 문자열에서 특정 index에 해당하는 문자

        System.out.printf("ch = %c\n", ch);
        ch += 32;

        System.out.printf("ch = %c\n", ch);
        int len = str.length(); // 문자열의 길이

        System.out.printf("str의 길이 : %d\n", len);

        String result = ""; // Empty String
        result += ch; // 문자열 더하기(문자열 추가)
        System.out.printf("result : %s\n", result);
        
        
        // 상수(Constant) : 더 이상 변경 불가능한 확정적인 값
        final int GAP = 32;
//        GAP = 30; 변경XX
        
        // str을 모두 소문자로 변환하는 코드를 작성하세요
        // for 반복문을 이용하여 작성하세요.
        // 알파벳을 입력받아서 처리하도록 구현하세요.

        // 스캐너 열기
        Scanner sc = new Scanner(System.in);
        // 문자열 입력받기
        // ex) HeLLo --> hEllO
        System.out.print("알파벳을 입력하세요 >>>");
        str = sc.nextLine();

        len = str.length();
        result = ""; // Empty String
        for( int i = 0; i < len; i++){
            ch = str.charAt(i);
            // ch가 대문자인지 소문자인지 판별하는 if
//            if( ch > 96 ){
//                ch -= 32;
//            } else if ( ch < 96 ) {
//                ch += 32;
//            }
            if ( ch >= 'A' && ch <= 'Z'){
                ch += GAP;
            } else if ( ch >= 'a' && ch <= 'z') {
                ch -= GAP;
            }

            result += ch;
        }
        System.out.printf("result : %s\n", result);

        sc.close();
        // 스캐너 닫기

    }
}
