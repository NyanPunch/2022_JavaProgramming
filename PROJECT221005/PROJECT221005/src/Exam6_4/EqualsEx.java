package Exam6_4;
class Rect{
    int width;
    int height;
    public Rect(int width, int height){
        this.height = height; this.width = width;
    }
    public boolean equals(Object obj){
        Rect p = (Rect)obj;
        if(width*height == p.width* p.height) return true;
        else return false;
    }
}

public class EqualsEx {
    public static void main(String[] args) {
        Rect a = new Rect(2,3);
        Rect b = new Rect(3, 2);
        Rect c = new Rect(3,4);
        if(a.equals(b)) System.out.println("a is equals b");
        if(a.equals(c)) System.out.println("a is equals c");
        if(b.equals(c)) System.out.println("b is equals c");
    }
}
