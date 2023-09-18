public class Exam3_9 {
    public static void main(String[] args) {
        int Arr[][] = new int[4][4];
        for(int i=0;i<Arr.length;i++){
            for(int j=0;j<Arr.length;j++)
                Arr[i][j] = (int)(Math.random()*10+1);
        }

        for(int i=0;i<Arr.length;i++){
            for(int j=0;j<Arr.length;j++)
                System.out.print(Arr[i][j]+" ");
            System.out.println();
        }
    }
}
