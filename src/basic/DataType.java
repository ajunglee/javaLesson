package basic;

import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        // Primitive Data Type 기본형
        //byte, short, char, int, long, float, double, boolean
        //short number; // number는 변수
        short age; // age는 변수
        float height; // 키

        // Referenced Data Type
        String name = "홍길동"; // String : 클래스 : 속성과 메소드를 갖고 있음, name : 설계단계에서 부름-객체(object), 프로젝트가 만들어졌을때-인스턴스(instance)
        //String gender = "남자";
        String gender = new String("여자"); // 생성자에 메모리 할당해주는 명령어.. new
        // String : 문자열을 처리하기 위한 데이터타입
        
        

        String str = "a"; //문자열 객체
        char ch = 'a'; // 문자형 변수

        //System.out.println("");

        // 시스템 입력장치를 오픈한다.
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 >>> ");
        name = sc.nextLine(); // 문자열을 입력받아서 name에 저장한다.

        System.out.print("성별을 입력하세요 >>> ");
        gender = sc.nextLine();

        System.out.print("나이를 입력하세요 >>> ");
        age = sc.nextShort(); // short형 정수를 입력받는다.

        System.out.print("키를 입력하세요 >>> ");
        height = sc.nextFloat(); // float형 실수를 입력받는다.

        // 시스템 입력장치를 닫는다.
        sc.close();

        //String.format() 메소드(method)를 이용하여 새로운 문자열을 생성한다.
        str = String.format("이름 : %s, 성별 : %s, 나이 : %d, 키 : %.2f", name, gender, age, height);
        System.out.println(str);


    }
}
