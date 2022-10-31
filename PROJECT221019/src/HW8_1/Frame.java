package HW8_1;

import javax.swing.*;

public class Frame extends JFrame {
    public Frame() {
        setTitle("Let's study java");
        setSize(400,200); // 프레임 크기 400 x 200
        setVisible(true); // 프레임 출력
    }
    public static void main(String[] args) {
        Frame frame = new Frame();
    }
}
