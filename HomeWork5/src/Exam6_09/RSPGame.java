package Exam6_09;

import java.util.Scanner;

public class RSPGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, computer;
        while(true){
            System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
            num = sc.nextInt(); //철수 입력
            computer = (int)(Math.random()*3+1); //컴퓨터 랜덤 입력
            if(num == 4) break;
            System.out.print("철수(");
            switch (num) {
                case 1: //철수 가위
                    System.out.print("가위) : 컴퓨터(");
                    if(computer == 2) {
                        System.out.print("바위)\n컴퓨터가 이겼습니다.\n");
                    }
                    else if(computer == 3){
                        System.out.print("보)\n철수가 이겼습니다.\n");
                    }
                    else System.out.println("가위)\n비겼습니다.");
                    break;
                case 2: //철수 바위
                    System.out.print("바위) : 컴퓨터(");
                    if(computer == 3) {
                        System.out.print("보)\n컴퓨터가 이겼습니다.\n");
                    }
                    else if(computer == 1){
                        System.out.print("가위)\n철수가 이겼습니다.\n");
                    }
                    else System.out.println("가위)\n비겼습니다.");
                    break;
                case 3: //철수 보
                    System.out.print("보) : 컴퓨터(");
                    if(computer == 1) {
                        System.out.print("가위)\n컴퓨터가 이겼습니다.\n");
                    }
                    else if(computer == 2){
                        System.out.print("바위)\n철수가 이겼습니다.\n");
                    }
                    else System.out.println("보)\n비겼습니다.");
                    break;
                default:
                    System.out.println("잘못 입력했습니다.");
                    break;
            }
        }
        sc.close();
    }
}
