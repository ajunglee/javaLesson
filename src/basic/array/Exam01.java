package basic.array;

import java.util.Arrays;

public class Exam01 {
    public static void main(String[] args) {
        // 데이터를 묶어서 관리하기
        // 배열(Array)

        // 배열을 초기화한다.
        int num = 10;
        num += 5;
        System.out.println( num );

        int[] arr = {10, 20, 30, 40, 50}; // 각 요소를 '원소' '요소' 'item'으로 부르기도 한다.
        // 첫번째 특성 : 배열은 순서(index)를 갖는다.
        // 두번째 특성 : 순서는 반드시 0부터 시작한다.(첫번째 아이템의 인덱스는 0이다.)
        // 세번째 특성 : 배열은 고정된 길이를 갖는다.(5개)
        // 네번재 특성 : 마지막 요소의 인덱스는 길이-1이다.

//        arr[0] += 5;
//        System.out.println( arr[0] );
//
//        arr[1] += 5;
//        System.out.println( arr[1] );
//
//        arr[2] += 5;
//        System.out.println( arr[2] );
//
//        arr[3] += 5;
//        System.out.println( arr[3] );
//
//        arr[4] += 5;
//        System.out.println( arr[4] );

        for(int i=0; i<5; i++){
            arr[i] += 5;
            //System.out.println("arr["+i+"] = " + arr[i]);
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
        // 배열명.length  : 배열의 길이(사이즈)
        System.out.println("배열의 길이 : " + arr.length);

        // Enhanced for
        // for(변수 : 배열)
        for(int number : arr) {
            System.out.printf("number = %d\n", number+5);
        }

        // 배열을 출력하기
        System.out.println(Arrays.toString(arr) );
    }
}
