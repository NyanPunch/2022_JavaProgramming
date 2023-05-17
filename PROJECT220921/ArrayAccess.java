//exam 3-7
import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intArr[] = new int[5];

        int max = 0;
        System.out.println("양수를 5개 입력하세요.");
        for(int i=0;i<5;i++){
            intArr[i] = sc.nextInt();
            if(intArr[i] > max) max = intArr[i];
        }
        System.out.println("가장 큰 수는 "+max+"입니다.");
        sc.close();
    }
}
