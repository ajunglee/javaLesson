package basic;

// 클래스의 이름은 영문자 대문자로 시작하게 만든다.
public class Var {
    public static void main(String[] args) {
//        첫번째 명령문 - 출력문
        System.out.println("Hello Java");   // 문자열
        System.out.println(10); // 정수형
        System.out.println("PI : " + 3.14F);    // 문자열과 실수형
        System.out.println("Marathon : " + 42.195); // 문자열과 실수형

        // 제어문자(Control Character)와 출력
        System.out.print("Hello\n");    // \n : 줄바꿈
        System.out.print("Java");
        System.out.print("Hello\t");    // \t : tab문자(기능)
        System.out.print("Ja\\va\n");

        // 형식 문자(Format Character)
        System.out.printf("철수의 나이는 %5d살 입니다.\n", 15);    // %d : 정수 표현
        System.out.printf("철수의 키는 %7.2fcm 입니다.\n", 161.5);  // %f : 실수 표현
        System.out.printf("철수의 키는 %7.1fcm이고, 몸무게는 %5.1fkg 입니다.\n", 161.5635, 60.0);  // 개수와 위치가 맞아야 한다!!!
        System.out.printf("%s와 %s는 친구입니다\n", "영희", "철수");   // %s : 문자열
        System.out.printf("%c%c%c 초코렛\n", 'A', 'B', 'C');   // %c : 문자

        //
        // 데이터 타입(Data Type)과 변수(Variable)
        // 정수형
        byte a1;    // 1바이트 --> 변수를 선언한다.
        short a2;   // 2바이트
        char a3;    // 2바이트
        int a4;     // 4바이트
        long a5;    // 8바이트

        // 실수형
        float a6;   // 4바이트
        double a7;  // 8바이트

        // 논리형
        boolean a9; // 1바이트

        a1 = 100;
        byte b1 = 100;  // 1바이트 --> 선언과 사용을 한번에 : 초기화
        byte c1 = 100;
//        byte d1 = a1 + b1 + c1; 이렇게 하면 에러. 300을 담을 수 없음.
        //a2 = 128; // byte : -128~127(0포함) 256개
        a1 = -128;

        // 변수의 작성 규칙
        // 1. 대소문자를 완벽하게 구분한다. a1과 A1은 다르다.
        // 2. 숫자와 _(언더바)를 사용할 수 있다.
        // 3. 한글 사용은 안된다.
        // 4. 숫자가 제일 앞에 나올 수 없다. 1a(x), 2a 이런거 안됨!!
        // 5. 키워드(Reserved Word)는 단독으로 변수명으로 사용할 수 없다.(ex. public class, byte, short...)

        // 변수명을 작성할 때 자바언어의 문화적 특징
        // 1. 변수명은 가급적으로 소문자로 시작하게 작성한다.
        // 2. 변수명만 보면 어떤 종류의 데이터를 처리하는 변수인지 짐작 가능하도록 작성한다.
        // ex) kor = 100; total = kor + math + eng;
        // 3. 두개 이상의 영단어를 붙여서 사용할 시에는 카멜 표기법을 따른다.(두번째 단어 첫글자를 대문자로 사용)
        // ex) myData, avgRank

        // 기타 : git : 코드관리(버전관리) 툴, github 설치

    }
}
