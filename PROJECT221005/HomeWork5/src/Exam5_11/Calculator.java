package Exam5_11;

import java.util.Scanner;

class Add extends Calc{
    public int calculate(){return (a + b);}
}
class Sub extends Calc{
    public int calculate(){return (a - b);}
}
class Mul extends Calc{
    public int calculate(){return (a * b);}
}
class Div extends Calc{
    public int calculate(){return (a / b);}
}
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오>> ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        char oper = sc.next().charAt(0); //연산자를 문자로 변환
        Calc exp;
        switch (oper) {
            case '+':
                exp = new Add(); break;
            case '-':
                exp = new Sub(); break;
            case '*':
                exp = new Mul(); break;
            case '/':
                exp = new Div(); break;
            default:
                System.out.println("잘못된 연산자입니다.");
                sc.close();
                return;
        }
        exp.setValue(a, b); //a와 b 값을 객체에 저장
        if(exp instanceof Div && b == 0) //0으로 나누는 경우
            System.out.println("계산할 수 없습니다.");
        else
            System.out.println(exp.calculate());
        sc.close();
    }
}
