package basic.ctrl;

import java.util.Scanner;

public class Exam06 {
    public static void main(String[] args) {
//        float avg = 95.3F; // 9.53
//        float avg = 100f;
//        char grade = 'A';
//
//        int div = (int) (avg / 10); // 9
//        switch ( div ){
//            case 10:
//            case 9:
//                grade = "A";
//                break;
//            case 8:
//                grade = "B";
//                break;
//            case 7:
//            case 6:
//            default:
//                grade = 'C';
//        }

        // avg : 실수값으로 입력받아서 (0.0 ~ 100.0)
        // 100 ~ 90 이면 'A'
        // 80 ~ 89 이면 'B'
        // 70 ~ 79 이면 'C'
        // 60 ~ 69 이면 'D'
        // 그 외는 'F'
        // 값을 grade 변수에 대입하고
        //
        // 출력형식)
        // 평균 95.1점은 A학점입니다.

        Scanner sc = new Scanner(System.in);
        System.out.print("평균 점수를 입력하세요>>>");
        float avg = sc.nextFloat();
        char grade;
        int div = (int)(avg / 10);

//        avg = sc.nextInt();

        switch ( div ){
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }

        System.out.printf("평균 %.1f점은 %c학점입니다.", avg, grade);

        sc.close();

        // grade값에 따라서...
        // 'A'이면 "완전 우수한 학생입니다"
        // 'B'이면 "보통 우수한 학생입니다"
        // 'C', 'D'이면 "보통 학생입니다, 노력이 필요합니다."
        // 'F' 이면 "처절한 노력이 필요합니다."
        // 를 출력하세요.



    }
}
