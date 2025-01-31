package basic.array;

import java.util.Arrays;
import java.util.Random;

public class Exam07 {
    public static void main(String[] args) {

        Random rand = new Random();

        int[] lotto = new int[6];
        for(int i=0; i< lotto.length; i++){
            lotto[i] = rand.nextInt(1,45);
        }
        System.out.println(Arrays.toString(lotto));

        // 배열 정렬하기
        Arrays.sort(lotto);

        System.out.println(Arrays.toString(lotto));

    }
}
