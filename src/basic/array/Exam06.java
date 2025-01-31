package basic.array;

import java.util.Arrays;

public class Exam06 {
    public static void main(String[] args) {

        // Jagged Array (가변 길이 배열)
        int[][] matrix = new int[3][]; // 3(행) X 5(열)
        // matrix = {{},{},{}};
        //matrix[0] = new int[3]; // matrix 2차원 배열의 첫번째 배열의 요소를 3칸짜리 1차원 배열로 생성
        //matrix[1] = new int[3];
        //matrix[2] = new int[3];

        for(int i=0; i< matrix.length; i++){
            matrix[i] = new int[3];
        }

        for(int[] arr : matrix) {
            // Arrays.toString : 1차원 배열을 문자열로 변환하는 메소드
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("=====================================");

        for(int i=0; i< matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

        /*
        * 1
        * 1,2
        * 1,2,3
        * 1,2,3,4
        * */

        int[][] dim = new int[4][];
        for(int i=0; i< dim.length; i++){
            dim[i] = new int[i+1];
            for(int j=0; j<dim[i].length; j++){
                dim[i][j] = j+1;
            }
        }
        for(int[] arr : dim) {
            //System.out.println(Arrays.toString(arr));
            for(int num : arr){
                System.out.printf("%d, ", num);
            }
            System.out.println();
        }

    }
}
