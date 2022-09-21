//exam 3-18
public class NumException {
    public static void main(String[] args) {
        String[] stringNum = {"23", "12", "3.141592", "998"};
        int i=0;
        try {
            for(i=0;i< stringNum.length;i++) {
                int j = Integer.parseInt(stringNum[i]);
                System.out.println("숫자로 변환된 값은 " + j);
            }
        }
        catch(NumberFormatException e){
            System.out.println(stringNum[i]+ "는 정수로 변환할 수 없습니다.");
        }
    }
}
