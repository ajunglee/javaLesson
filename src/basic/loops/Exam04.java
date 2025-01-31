package basic.loops;

import java.util.Scanner;

public class Exam04 {
    public static void main(String[] args) {
        // 정수를 입력받아서 해당 정수의 모든 약수를 구하시오.
        // 약수 : 나누어 떨어지는 수
        // 약수이면 출력
        // 10
        // 1, 2, 5, 10

        // 정수를 입력받는다.
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력해주세요.");
        int num = sc.nextInt();

        for (int i = 1; i<=num; i++){
            if(num % i == 0){
                System.out.printf("%d의 약수 : %d\n", num, i);
            }
        }
        // 반복문을 통하여 약수인지 체크하고
        // 약수이면 출력한다.

        sc.close();

    }
}
