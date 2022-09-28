package Exam08;

import java.util.Scanner;

class Phone{
    private String name;
    private String tel;

    public Phone(String name, String tel){
        this.name = name; this.tel = tel;
    }
    public String GetName(){
        return name;
    }
    public String GetTel(){
        return tel;
    }
}
public class PhoneBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("인원수>>");
        int num = sc.nextInt();
        int i = 0;
        Phone [] p = new Phone[num];
        for(i=0;i<num;i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String name = sc.next(); //이름입력
            String tel = sc.next(); //전화번호입력
            p[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다...");

        while(true) {
            System.out.print("검색할 이름>>");
            String findname = sc.next();
            if(findname.equals("그만")) break;
            for(i=0;i<num;i++){
                if(findname.equals(p[i].GetName())) {
                    System.out.println(findname+"의 번호는 "+p[i].GetTel()+" 입니다.");
                    break;
                }
            }
            if(i == num) System.out.println(findname + "이 없습니다.");
        }
        sc.close();
    }
}
