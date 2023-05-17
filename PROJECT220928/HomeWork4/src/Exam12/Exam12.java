package Exam12;

import java.util.Scanner;

class Concert{
    private String S[];
    private String A[];
    private String B[];
    private Scanner sc;
    Concert(){
        sc = new Scanner(System.in);
        S = new String[10];
        A = new String[10];
        B = new String[10];
        for(int i=0;i<S.length;i++){
            S[i] = "---"; A[i] = "---"; B[i] = "---";
        }
    }

    public static void PrintSeat(String seat[]){ //등급별 좌석 출력
        for(int i=0;i< seat.length;i++){
            System.out.print(" "+seat[i]+" ");
        }
        System.out.println();
    }
    public void AllPrint(){ //모든 좌석 출력
        System.out.print("S>>");
        Concert.PrintSeat(S);
        System.out.print("A>>");
        Concert.PrintSeat(A);
        System.out.print("B>>");
        Concert.PrintSeat(B);
        System.out.println("<<조회를 완료했습니다.>>");
    }
    public void SelectSeat(){
        while(true){
            System.out.print("좌석구분 S(1), A(2), B(3)>>");
            int select = sc.nextInt();
            switch (select){
                case 1:
                    System.out.print("S>>");
                    PrintSeat(S);
                    InputSeat(S);
                    return;
                case 2:
                    System.out.print("A>>");
                    PrintSeat(A);
                    InputSeat(A);
                    return;
                case 3:
                    System.out.print("B>>");
                    PrintSeat(B);
                    InputSeat(B);
                    return;
                default:
                    System.out.println("다시 입력해 주세요.");
            }
        }
    }
    public void InputSeat(String seat[]){
        System.out.print("이름>>");
        String name = sc.next();
        while(true){
            System.out.print("번호>>");
            int num = sc.nextInt();
            if(seat[--num].equals("---")){
                seat[num] = name;
                break;
            }
            else System.out.println("다른 좌석을 선택해 주세요.");
        }
    }
    public void DeleteSeat(){
        while(true){
            System.out.print("좌석 S:1, A:2, B:3>>");
            int select = sc.nextInt();
            switch (select){
                case 1:
                    System.out.print("S>>");
                    PrintSeat(S);
                    Delete(S);
                    return;
                case 2:
                    System.out.print("A>>");
                    PrintSeat(A);
                    Delete(A);
                    return;
                case 3:
                    System.out.print("B>>");
                    PrintSeat(B);
                    Delete(B);
                    return;
                default:
                    System.out.println("다시 입력해 주세요.");
            }
        }
    }
    public void Delete(String seat[]){
        System.out.print("이름>>");
        String name = sc.next();
        for(int i=0;i<seat.length;i++){
            if(name.equals(seat[i])){
                seat[i] = "---";
                break;
            }
        }
    }
}
public class Exam12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        Concert concert = new Concert();
        int num;
        while(true){
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            num = sc.nextInt();
            switch (num){
                case 1:
                    concert.SelectSeat();
                    break;
                case 2:
                    concert.AllPrint();
                    break;
                case 3:
                    concert.DeleteSeat();
                    break;
                case 4:
                    sc.close();
                    return;
                default:
                    System.out.println("다시 입력해 주세요.");
            }
        }
    }
}