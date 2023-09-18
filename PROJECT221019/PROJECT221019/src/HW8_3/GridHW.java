package HW8_3;

import javax.swing.*;
import java.awt.*;

public class GridHW extends JFrame {
    public GridHW() {
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(1,10);

        Container c = getContentPane();
        c.setLayout(grid);
        for(int i=0;i<10;i++){

        }

        setSize(500, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridHW();
    }
}
