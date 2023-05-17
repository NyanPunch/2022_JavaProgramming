//exam 3-8
import java.util.Scanner;

public class ArrayLength {
    public static void main(String[] args) {
        int intArr[] = new int[5];
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print(intArr.length + "개의 정수를 입력하세요 >>");
        for(int i=0;i<intArr.length;i++) intArr[i] = scanner.nextInt();

        for(int i=0;i<intArr.length;i++) sum += intArr[i];

        System.out.println("평균은 " + (double)sum/intArr.length);
        scanner.close();
    }
}
