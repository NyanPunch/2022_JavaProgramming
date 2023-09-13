package OpenChallenge6;

import java.util.Scanner;
public class Histogram {
    private int Data [] = new int [26]; //알파벳 26자
    public void run(){
        String s = read();
        makeHistogram(s);
        drawHistogram();
    }
    private void makeHistogram(String text) {
        String s = text.toString();
        s = s.toUpperCase();

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c >= 'A' && c <= 'Z') {
                int index = c - 'A';
                Data[index]++;
            }
        }
    }
    public String read(){
        System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
        StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        while(true){
            String line = sc.nextLine();
            if(line.length() == 1 && line.charAt(0) == ';') break;
            sb.append(line);
        }
        sc.close();
        return sb.toString();
    }
    private void drawHistogram() {
        System.out.println("\n히스토그램을 그립니다.");
        for(int i =0; i<Data.length; i++) {
            System.out.print((char)('A'+ i)); //대문자를 출력
            for(int j=0; j<Data[i]; j++)  //데이터 수만큼 -를 출력
                System.out.print('-');
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Histogram h = new Histogram();
        h.run();
    }
}
