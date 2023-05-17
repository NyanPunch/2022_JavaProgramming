public class Exam3_7 {
    public static void main(String[] args) {
        int Arr[] = new int[10];
        int sum =0;
        for(int i=0;i<Arr.length;i++){
            Arr[i] = (int)(Math.random()*10+1);
            sum += Arr[i];
        }
        System.out.print("랜덤한 정수들 : ");
        for(int i=0;i<Arr.length;i++) {
            System.out.print(Arr[i]+" ");
        }
        System.out.println("평균은 "+sum/Arr.length);
    }
}
