package Exam7_10;

class GStack<T> {
    int tos;
    Object [] stck;
    public GStack() {
        tos = 0;
        stck = new Object [10];
    }
    public void push(T item) {
        if(tos == 10)
            return;
        stck[tos] = item;
        tos++;
    }
    public T pop() {
        if(tos == 0)
            return null;
        tos--;
        return (T)stck[tos];
    }
}

public class GenericMethodEx { // T가 타입 매개 변수인 제네릭 메소드
    public static <T> GStack<T> reverse(GStack<T> a) {
        GStack<T> s = new GStack<T>();
        while (true) {
            T tmp;
            tmp = a.pop(); //하나를 꺼냄
            if (tmp==null)
                break;
            else
                s.push(tmp); //삽입
        }
        return s; //스택을 반환
    }
    public static void main(String[] args) {
        GStack<Double> gs = new GStack<Double>();
        for (int i=0; i<5; i++) {
            gs.push(new Double(i));
        }
        gs = reverse(gs);
        for (int i=0; i<5; i++) {
            System.out.println(gs.pop());
        }
    }
}

