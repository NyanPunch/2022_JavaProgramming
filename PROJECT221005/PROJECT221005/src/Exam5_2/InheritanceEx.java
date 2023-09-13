package Exam5_2;
class Person{
    private int weight;
    int age;
    protected int height;
    public String name;

    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getWeight(){
        return weight;
    }
}

class Student extends Person{
    public void set(){
        age = 30; //접근 가능
        name = "홍길동"; //접근 가능
        height = 175; //접근 가능
        //weight = 99; private 이므로 접근 불가
        setWeight(99); //간접 접근
    }
}
public class InheritanceEx {
    public static void main(String[] args) {
        Student s = new Student();
        s.set();
    }
}
