package basic.ctrl;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {

        char ch = 'a';
        short sh = 65;
        System.out.printf("%c\n", sh);
        System.out.printf("%c\n", ++sh);
        System.out.printf("%c\n", ++sh);


        // 난수값을 발생시켜 주는 객체
        Random rand = new Random();
        int com_wins = 0;
        int user_wins = 0;

        for(int i = 0; i<=9; i++){
        int com = rand.nextInt(1,7); // 1~6(7-1) 사이의 값을 무작위로 생성하여 com에 대입
        System.out.printf("컴퓨터의 숫자는 %d입니다\n 당신 차례입니다.(엔터키를 누르세요)\n", com);

        //Scanner sc = new Scanner(System.in);
       // sc.nextLine(); // 엔터키를 입력해야 다음 처리를 할 수 있도록 대기상태를 만든다.

        int user = rand.nextInt(1,7);
        System.out.printf("당신의 숫자는 %d입니다\n", user);
        // 당신의 숫자는 x입니다.

        // com과 user의 값을 비교하여
        // com이 크면 "컴퓨터의 승리"
        // user가 크면 "사용자 승리"
        // 같으면 "비겼습니다"를 출력하세요
        
//        String result = "";
//        if ( com == user ){
//            result = "비겼습니다";
//        } else if ( user > com ){
//            result = "사용자의 승리";
//        } else if ( com > user ){
//            result = "컴퓨터의 승리";
//        }

//        if( com > user )
//            System.out.print("컴퓨터의 승리");
//        else if ( com < user )
//            System.out.print("사용자의 승리");
//        else if ( com == user )
//            System.out.println("비겼습니다");

       // sc.close();
        
        // 컴퓨터 승리 : x번
        // 사용자 승리 : x번

            if( com > user ){
                System.out.print("컴퓨터의 승리");
                com_wins++;
            }
            else if ( com < user ){
                System.out.print("사용자의 승리");
                user_wins++;
            }

            else if ( com == user )
                System.out.println("비겼습니다");
        }

        //System.out.printf("컴퓨터가 %d번, 사용자가 %d번 승리했습니다\n",,);
    }
}
