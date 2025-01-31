package basic.array;

public class Exam03 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 2, 9, 20, 44, 88, 41, 0, 66, 48, 85, 20, 73};
        for(int number : nums) {
            System.out.println( number );
        }
        System.out.println(); //줄바꿈

        for(int i=0; i<nums.length; i++){
            System.out.printf("%d ", nums[i]);
        }

        for(int i=0; i<nums.length; i+=2){
            System.out.printf("%d ", nums[i]);
        }
    }
}
