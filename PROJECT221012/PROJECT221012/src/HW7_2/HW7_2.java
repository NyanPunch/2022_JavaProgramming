package HW7_2;

import java.util.ArrayList;
import java.util.Scanner;

public class HW7_2 {
    public static void main(String[] args) {
        ArrayList<Character> al = new ArrayList<Character>();
        Scanner sc = new Scanner(System.in);

        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
        for(int i=0;i<6;i++){
            String s = sc.next();
            char ch = s.charAt(0);
            if(ch>= 'A' && ch <= 'D' || ch == 'F') al.add(ch);
            else {
                System.out.println("계산할 수 없는 점수입니다.");
                sc.close();
                return;
            }
        }
        double score = 0.0;
        for(int i=0;i<al.size();i++){
            char ch = al.get(i);
            switch (ch){
                case 'A': score += 4.0; break;
                case 'B': score += 3.0; break;
                case 'C': score += 2.0; break;
                case 'D': score += 1.0; break;
                case 'F': score += 0.0; break;
            }
        }
        System.out.println(score/al.size());
        sc.close();
    }
}
