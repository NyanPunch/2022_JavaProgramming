package Exam5_09;

interface Stack {
    int length(); //스택에 저장된 개수 리턴
    int capacity(); //스택의 전체 저장 가능 개수 리턴
    String pop(); //스택의 top실수 저장
    boolean push(String val); //스택의 top 실수 리턴
}