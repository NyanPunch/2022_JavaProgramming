package Exam10;

import java.util.Scanner;

class Dictionary{
    private static String[] kor = {"사람", "아기", "돈", "미래","희망"};
    private static String[] eng = {"love","baby","money","future","hope"};
    public static String kor2eng(String word){
        //검색코드 작성
        for(int i=0; i<kor.length;i++) {
            if(word.equals(kor[i])) {
                System.out.print(word+"은(는) ");
                return eng[i];
            }
        }
        return "false";
    }
}
public class DicApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("한영 단어 검색 프로그램입니다.");
        while(true) {
            System.out.print("한글 단어? ");
            String word = sc.next();
            if(word.equals("그만")) break;
            String eng = Dictionary.kor2eng(word);
            if(eng.equals("false"))
                System.out.println(word+"는 저의 사전에 없습니다.");
            else
                System.out.println(eng);
        }
        sc.close();
    }
}
