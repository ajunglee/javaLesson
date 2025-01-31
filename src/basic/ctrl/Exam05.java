package basic.ctrl;

import java.util.Scanner;

public class Exam05 {
    public static void main(String[] args) {
        // 입력값이...
        // 1이면 서울
        // 2이면 경기도
        // 3이면 강원도
        // 4이면 경상도
        // 5이면 전라도
        // 6이면 제주도
        // 7이면 해외
        // 를 출력하는 프로그램을 작성하세요.


        String local = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("지역코드를 입력하세요>>>");
        int code = sc.nextInt();
        // 딱 떨어지는 값을 구할 때 if보다 swith가 더 좋다.
        switch ( code ){
            case 1:
                local = "서울";
                break; // 해당 swith ~ case 구문을 탈출 시킴
            case 2:
                local = "경기도";
                break;
            case 3:
                local = "강원도";
                break;
            case 4:
                local = "경상도";
                break;
            case 5:
                local = "전라도";
                break;
            case 6:
                local = "제주도";
                break;
            case 7:
                local = "해외";
                break;

            default:
                local = "알 수 없음";
        }

//        if( code == 1 )
//            local = "서울";
//        else if ( code == 2 ) {
//            local = "경기도"
//        } else if ( code == 3 ) {
//            local = "강원도"
//        } else if ( code == 4 ) {
//            local = "경상도"
//        } else if ( code == 5 ) {
//            local = "전라도"
//        } else if ( code == 6 ) {
//            local = "제주도"
//        } else if ( code == 7 ) {
//            local = "해외"
//        } else
//            local = "알 수 없음";

        System.out.printf("입력한 코드는 %d는 %s입니다.");
        sc.close();
    }
}
