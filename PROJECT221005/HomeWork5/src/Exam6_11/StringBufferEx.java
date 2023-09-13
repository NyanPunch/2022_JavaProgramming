package Exam6_11;

import java.util.Scanner;

public class StringBufferEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(">>");
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);

        while(true) {
            System.out.print("명령: ");
            String command = sc.nextLine();
            if(command.equals("그만")) break;

            String[] token = command.split("!");
            if(token.length != 2){
                System.out.println("잘못된 명령입니다.");
            }
            else{
                if(token[0].length() == 0 || token[1].length() == 0) {
                    System.out.println("잘못된 명령입니다!");
                    continue;
                }
                int index = sb.indexOf(token[0]);
                if(index == -1) { // not found!
                    System.out.println("찾을 수 없습니다!");
                    continue;
                }
                sb.replace(index, index+token[0].length(), token[1]);
                System.out.println(sb.toString());
            }
        }
        sc.close();
    }
}
