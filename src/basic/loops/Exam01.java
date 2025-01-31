package basic.loops;

public class Exam01 {
    public static void main(String[] args) {
        // 반복문
        // while, do~while, for --> enhanced for

        // while
//        while ( 조건식 ) {
//          반복 실행할 명령문들...
//        }
        
        int i = 0;
        while ( i < 10 ){
            System.out.printf("i = %d\n", ++i);
        }

        System.out.println("while 반복문 탈출");
            
        //여기서는 i가 10이 되어있음.
        i = 0;
        int total = 0;
        while ( i <= 10 ){
            total += i; // total = total + i //total += i++
            i++;
        }
        System.out.printf("total = %d\n", total);

        // 0부터 100까지 짝수들의 합을 구하세요.
        i = 0;
        total = 0;

        while ( i <= 100 ){
            total += i;
            i += 2; // i를 2씩 증가시키기.
        }
        System.out.printf("total = %d\n", total);
    }
}
