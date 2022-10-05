package Exam6_8;

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This");

        sb.append(" is pencil"); //문자열 뒤에 붙이기
        System.out.println(sb);
        sb.insert(7, " my"); //문자열 삽입S
        System.out.println(sb);
        sb.replace(8, 10, "your"); //문자열 변경
        System.out.println(sb);
        sb.delete(8, 13); //8~13 삭제
        System.out.println(sb);
        sb.setLength(4); //문자열 길이 수정
        System.out.println(sb);
    }
}
