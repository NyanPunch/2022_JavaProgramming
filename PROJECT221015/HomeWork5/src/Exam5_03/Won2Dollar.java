package Exam5_03;

import java.util.Scanner;
abstract class Converter {
    abstract protected double convert(double won);
    protected double ratio; //환율
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("원을 달러로 바꿉니다.");
        System.out.print("원을 입력하세요>> ");
        double val = scanner.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: " + res +"달러입니다");
        scanner.close();
    }
}

public class Won2Dollar extends Converter{
    public Won2Dollar(double ratio) {
        this.ratio = ratio;
    }
    protected double convert(double won) {
        return won/ratio;
    }
    public static void main(String[] args) {
        Won2Dollar toDollar = new Won2Dollar(1200);
        toDollar.run();
    }
}
