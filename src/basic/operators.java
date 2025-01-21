package basic;

public class operators {
    // Entry Point (프로그램 진입점)
    public static void main(String[] args) {
        //psvm or main
        int num1;
        int num2;
        int num3;

        // 연산자
        // 1. 산술 연산자 : +, -, *, /, %(나머지를 구하는 나누기), ++(1씩 증가), --(1씩 감소)


        num1 = 10;
        num2 = 3;
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);

        // 대입연산자 왼쪽에는 무조건 변수, 오른쪽엔 무엇이든 올 수 있다.
        num3 = num1 + num2;
        System.out.println("num1 + num2 = " + num3);

        num3 = num1 - num2;
        System.out.println("num1 + num2 = " + num3);

        num3 = num1 * num2;
        System.out.println("num1 * num2 = " + num3);

        num3 = num1 / num2; // 정수와 정수의 나누기 연산의 결과는 무조건 정수가 나온다.(몫)
        System.out.println("num1 / num2 = " + num3);

        num3 = num1 % num2;
        System.out.println("num1 % num2 = " + num3);

        // 실수형 변수를 선언
        // 실수와 정수의 나누기 연산의 결과는 무조건 실수가 나온다.
        float fNum;
        fNum = num1 / (float)num2; //(float) 앞에 적으면 정수를 실수로 잠깐 만들어준다. // 형변환(Type Casting)
        System.out.println("num1 / num2 = " + fNum);
        
        // num1 = num1 + 1;

        // 증감 연산자 : ++, --
        System.out.printf("num1 : %d\n ", num1);
        System.out.printf("num1 : %d\n ", num1++); // post-fix : 같은 줄에 사용된 명령을 먼저 실행하고 난 뒤 증가
        System.out.printf("num1 : %d\n ", num1++);
        System.out.printf("num1 : %d\n ", ++num1); // pre-fix : 변수의 값을 먼저 증가한 뒤 같은 줄에 있는 명령을 실행

        System.out.printf("num1 : %d\n ", num1);
        System.out.printf("num1 : %d\n ", num1--);
        System.out.printf("num1 : %d\n ", num1--);
        System.out.printf("num1 : %d\n ", --num1);

        // 2. 대입 연산자 : =, +=, -=, *=, %=
        num3 += num1; // num3 = num3 + num1;
        num3 -= num1; // num3 = num3 - num1;
        num3 *= num1; // num3 = num3 * num1;
        num3 /= num1; // num3 = num3 / num1;
        num3 %= num1; // num3 = num3 % num1; 나누고 나머지를 넣기


        // 형변환
        short shNum = (short) num1; //"명시적 형변환", over-flow가 발생할 수 있고, 그 책임은 개발자에게 있다.
        // over-flow를 완전히 해결하는 것은 아니고 임시적으로 변경시켜준다.
        num1 = shNum; //"묵시적 형변환"

        // 3. 관계(비교) 연산자 : >, <, >=, <=, ==, !=(다르다)
        num1 = 10;
        num2 = 5;
        boolean bOk = num1 > num2;
        System.out.println("num1 > num2 : " + bOk);

        bOk = num1 < num2;
        System.out.println("num1 < num2 : " + bOk);

        bOk = num1 == num2;
        System.out.println("num1 == num2 : " + bOk);

        bOk = num1 != num2;
        System.out.println("num1 != num2 : " + bOk);

        // 4. 논리 연산자 : &&(and), ||(or), !(not)
        bOk = num1 > num2 && num1 == num2; //&& 양쪽이 모두 true어야 결과값이 true가 나온다.
        System.out.println("bOk : " + bOk);
        bOk = num1 < num2 || num1 != num2;// || 둘 중 하나만 true여도 true 값이 나온다.
        bOk = !(num1 < num2); //not연산 f -> t / t -> f
        System.out.println("bOk : " + bOk);

        // 5. 비트 연산자 : &(and), |(or), ~(not), ^(xor), <<, >>(shift)
        // 1비트 안에는 0과 1만 들어갈 수 있다. 1+1 = 10 으로 표현 0001 :1, 0010:2, 0011:3...
        num1 = 5; // 0101 -> ftft(0101) and의 곱
        num2 = 3; // 0011 -> fftt(0011) = ffft = 0001 = 1

        num3 = num1 & num2;
        System.out.println("num3 : " + num3);
        num3 = num1 | num2; //fttt = 0111 = 7 or의 합
        System.out.println("num3 : " + num3);

        num3 = ~num1; // '1'(부호비트 or sign비트)111 1010 맨 앞이 1이면 음수 -숫자
        System.out.println("num3 : " + num3);

        //xor : 두개의 비트가 같으면 0, 다르면 1로 셋팅된다.
        num3 = num1 ^ num2;
        System.out.println("num3 : " + num3);

        // shift
        num3 = num1 << 1; // num1의 비트를 왼쪽으로 한칸 이동시킴 0000 0101 -> 000 01010 -> 0000 1010 = 10
        num3 = num1 >> 1; // num1의 비트를 오른쪽으로 한칸 이동시킴

        // 6. 기타 연산자 : +(객체와 객체 연결), (조건식)?참일때 값 : 거짓일때 값 => 삼항 연산자
        num3 = (num1 == 5) ? 1 : 0;

    }
}
