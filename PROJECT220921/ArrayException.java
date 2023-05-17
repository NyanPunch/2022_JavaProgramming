//exam 3-16
public class ArrayException {
    public static void main(String[] args) {
        int[] intArr = new int[5];
        intArr[0] = 0;
        try{
            for(int i=0;i<5;i++){
                intArr[i+1] = i + 1 +intArr[i];
                System.out.println("intArr["+i+"] ="+intArr[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
        }
    }
}
