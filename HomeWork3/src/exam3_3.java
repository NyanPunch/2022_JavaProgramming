import java.util.Scanner;

public class exam3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하시오>>");
        int a = scanner.nextInt();

        for(int i=0;i<a;i++) {
            for (int j=0; j < a-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
