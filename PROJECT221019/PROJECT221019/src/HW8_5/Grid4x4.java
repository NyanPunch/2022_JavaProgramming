package HW8_5;

import javax.swing.*;
import java.awt.*;

public class Grid4x4 extends JFrame {
    public Grid4x4() {
        setTitle("4x4 Color Frame");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new GridLayout(4,4)); //그리드 4x4 생성

        for (int i = 0; i<16; i++){
            Color[] colors = new Color[] {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
                    Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY,
                    Color.WHITE, Color.DARK_GRAY, Color.BLACK, Color.ORANGE, Color.BLUE, Color.MAGENTA};
            JLabel label = new JLabel(i + "");
            label.setBackground(colors[i]);
            label.setOpaque(true);
            c.add(label);
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new Grid4x4();
    }
}
