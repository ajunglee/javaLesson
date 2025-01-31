package basic.array;

public class Exam02 {
    public static void main(String[] args) {
        String[] names = {"홍길동", "강호동", "유재석"};
        System.out.println("names의 길이 : " + names.length);

        // names 배열의 모든 요소들을 그대로 출력하기
        for (String name : names){
            System.out.println( name );
        }

        for(int i=0; i<names.length; i++){
            System.out.println( names[i] );
        }
    }
}
