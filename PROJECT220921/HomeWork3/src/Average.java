//Exam3-11
public class Average {
    public static void main (String[] args) {
        if(args.length == 0) {
            System.out.println("args.length = 0");
            return;
        }
        int sum=0;
        for (int i=0; i<args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println(sum/args.length);
    }
}
