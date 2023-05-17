public class Book4_5 {
    String title;
    String author;
    void show() {
        System.out.println(title + " " + author);
    }
    public Book4_5(){
        this("","");
        System.out.println("생성자 호출됨");
    }
    public Book4_5(String title){
        this(title,"작자미상");
    }
    public Book4_5(String title,String author){
        this.title = title; this.author = author;
    }

    public static void main(String[] args) {
        Book4_5 littlePrince = new Book4_5("어린왕자", "생텍쥐페리");
        Book4_5 loveStory = new Book4_5("춘향전");
        Book4_5 emptyBook = new Book4_5();
        loveStory.show();
    }
}
