package HW7_4;

import java.util.*;

public class HW7_4 {
    public static void print(Vector v) {
        int sum = 0;
        Iterator<Integer> it = v.iterator();
        while (it.hasNext()) {
            int n = it.next();
            System.out.print(n + " ");
            sum += n;
        }
        System.out.println();
        System.out.println("현재 평균 " + sum/v.size());
    }
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("강수량 입력(0 입력시 종료)>>");
            int n = sc.nextInt();
            if(n == 0) break;
            v.add(n);
            print(v);
        }
        sc.close();
    }
}
