package Exam5_09;

public class StringStack implements Stack {
    private String[] element; //스택의 저장 메모리
    private int top;
    public StringStack(int capacity) {
        element = new String[capacity];
        top = -1;
    }
    @Override
    public int length() { //현재 스택에 저장된 개수 리턴
        return top+1;
    }
    @Override
    public int capacity() { //현재 스택에 저장된 개수 리턴
        return element.length;
    }
    @Override
    public String pop() {
        if(top == -1) // stack is EMPTY
            return null;
        String s = element[top];
        top--; //스택 감소
        return s;
    }
    @Override
    public boolean push(String str) {
        if(top == element.length-1)
            return false; // stack is FULL
        else {
            top++;
            element[top] = str; //택에 저장 후 스택 증가
            return true;
        }
    }
}