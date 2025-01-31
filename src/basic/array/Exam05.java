package basic.array;

import java.util.Arrays;

public class Exam05 {
    public static void main(String[] args) {
        
        // 2차원 배열
        //int[][] dim2 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};

        int[][] dim2 = new int[2][3]; //{{1,2,3},{4,5,6}} dim2[i]=3(1,2,3)  //정해진 수가 없어서 0으로 초기화된다.
        int num = 0;
        for(int i=0; i< dim2.length; i++) {
            for(int j=0; j<dim2[i].length; j++){
                dim2[i][j] = j+1+(i*3);//i=0이 j만큼(3번)돈다.
                //0+1+(0*3)=1, 1+1+(0*3)=2, 2+1+(0*3)=3
                //0+1+(1*3)=4, 1+1+(1*3)=5, 2+1+(1*3)=6
            }
        }

        for(int i=0; i< dim2.length; i++) {
            for(int j=0; j<dim2[i].length; j++){
                System.out.printf("%d", dim2[i][j]);
            }
            System.out.println(); //줄바꿈
        }

        System.out.println("dim2의 길이 : " + dim2.length);

        for(int[] arr : dim2) {
            System.out.println(Arrays.toString( arr ));
        }

        System.out.println(Arrays.deepToString(dim2));

        /*
        int[][] dim2 = new int[][];
        * [10, 20, 30]
        * [40, 50, 60]
        * [70, 80, 90]
        [[10, 20, 30], [40,50,60], [70,80,90]]
        // for문을 이용하여 데이터 생성
        // for문을 이용하여 출력
        * */

        int[][] dim = new int[3][3];
        for(int i=0; i< dim.length; i++) {
            for(int j=0; j<dim[i].length; j++){
                dim[i][j] = (j+1+(i*dim[i].length))*10;
            }
        }
        for(int i=0; i< dim.length; i++) {
            for(int j=0; j<dim[i].length; j++){
                System.out.printf("%d", dim[i][j]);
            }
            System.out.println(); //줄바꿈
        }
        for(int[] arr : dim) {
            System.out.println(Arrays.toString( arr ));
        }
        System.out.println(Arrays.deepToString(dim));

        // 3차원 배열
        int[][][] dim3 = {{{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}},{{},{},{},{},{}},{{},{},{},{},{}}};
//        int[][][] dim3 = new int[3][5][3];

        
    }
}
