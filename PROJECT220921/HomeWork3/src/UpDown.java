import java.util.Random;
import java.util.Scanner;

public class UpDown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random(); //create Random

        int k = r.nextInt(100); //0~99
        int ans = -1;
        int up = 0, down = 99;

        System.out.println("수를 결정하였습니다. 맞춰 보세요.");
        while(true){
            System.out.println(up + "~" + down);
            ans = scanner.nextInt();
            if(k > ans) { //higher than answer
                System.out.println("더 높게");
                up = ans;
            }
            else if(k < ans) { //lower than answer
                System.out.println("더 낮게");
                down = ans;
            }
            else if(k == ans) {
                System.out.println("맞았습니다.");
                System.out.println("다시하시겠습니까?(y/n)>>");
                String text = scanner.next();
                if(text.equals("n")){
                    break;
                }
                else { //if 'y' reset k, up, down
                    k = r.nextInt(100); //0~99
                    up = 0; down = 99;
                }
            }
        }
        scanner.close();
    }
}
