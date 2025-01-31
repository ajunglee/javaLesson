package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class Exam04 {
    public static void main(String[] args) {
        // 정수형 5칸짜리 배열을 생성
        int[] arr = new int[5];

        for(int i=0; i<arr.length; i++) {
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));

        // 입력을 받아서 배열의 길이를 설정하기
        System.out.print("배열의 길이를 입력하세요 >>> ");
        Scanner sc = new Scanner(System.in); // 콘솔 입력 객체를 생성

        int count = sc.nextInt();
        int[] nums = new int[ count ];
        for(int i=0; i< nums.length; i++) {
            nums[i] = i+1;
        }
        System.out.println(Arrays.toString(nums));

        sc.nextLine(); // 입력버퍼 비우기(두번 나오지 않게 하기)

        String[] names = new String[3];
        for(int i=0; i< names.length; i++){
            System.out.print("이름을 입력하세요 >>> ");
            names[i] = sc.nextLine(); // 문자열을 입력받아 names 배열의 i번째 요소에 대입한다.
        }
        System.out.println(Arrays.toString(names));

        sc.close();
    }
}
