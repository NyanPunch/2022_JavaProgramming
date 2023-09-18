package OpenChallenge07;

import java.util.Scanner;
import java.util.Vector;

class Word{
    private String eng;
    private String kor;
    public Word(String eng, String kor){
        this.eng = eng;
        this.kor = kor;
    }
    public String getEng() {
        return eng;
    }
    public String getKor(){
        return kor;
    }
}
public class WordQuiz {
    private String name;
    private Vector<Word> v;

    public WordQuiz(String name) {
        this.name = name;
        v = new Vector<Word>();
        v.add(new Word("love", "사랑"));
        v.add(new Word("animal", "동물"));
        v.add(new Word("emotion", "감정"));
        v.add(new Word("human", "인간"));
        v.add(new Word("stock", "주식"));
        v.add(new Word("society", "사회"));
        v.add(new Word("baby", "아기"));
        v.add(new Word("honey", "꿀"));
        v.add(new Word("dall", "인형"));
        v.add(new Word("bear", "곰"));
        v.add(new Word("picture", "사진"));
        v.add(new Word("painting", "그림"));
        v.add(new Word("fault", "오류"));
        v.add(new Word("example", "예제"));
        v.add(new Word("eye", "눈"));
        v.add(new Word("statue", "조각상"));
    }

    void makeExample(int[] ex, int ansindex,int ans){
        int n[] = {-1, -1, -1, -1};
        int j;
        for(int i=0;i<4;i++){
            do{
                j = (int)(Math.random()*v.size());
            }while(j==ansindex || exists(n, j));
            n[i] = j;
        }
        n[ans-1] = ansindex;
        for(int i=0;i<4;i++){
            ex[i] = n[i];
        }
    }
    private boolean exists(int n[], int index) {
        for(int i=0; i<n.length; i++) {
            if(n[i] == index)
                return true;
        }
        return false;
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\"" + name + "\"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
        System.out.println("현재 " + v.size() + "개의 단어가 들어 있습니다.");
        while(true){
            int ansIndex = (int)(Math.random()*v.size());
            System.out.println(v.get(ansIndex).getEng()+ "?");
            int exam[] = new int [4];
            int ans = (int)(Math.random()*4+1);
            makeExample(exam, ansIndex, ans);
            for(int i=0;i<4;i++){
                System.out.print("(" + (i+1) + ")" + v.get(exam[i]).getKor());
            }
            System.out.print(":>");
            int player = sc.nextInt();
            if(player == -1){
                System.out.println("\"명품영어\"를 종료합니다...");
                return;
            }
            else if(player == ans) System.out.println("Excellent!");
            else System.out.println("NO!!");
        }
    }

    public static void main(String[] args) {
        WordQuiz wq = new WordQuiz("명품영어");
        wq.run();
    }
}
