//exam 3-6
import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("exit 입력 시 종료.");
        while(true){
            System.out.print(">>");
            String text = sc.nextLine();
            if(text.equals("exit")) break; // compare text "exit"
        }
        System.out.println("종료합니다.");
        sc.close();
    }
}
