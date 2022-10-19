package HW9_4;

import javax.swing.*;
import java.awt.*;

public class GridColorHW extends JFrame{
    public GridColorHW() {
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(1,10);

        Container c = getContentPane();
        c.setLayout(grid);
        c.add(new JButton("0"));

        c.add(new JButton("1"));
        c.setBackground(Color.ORANGE);
        c.add(new JButton("2"));
        c.add(new JButton("3"));
        c.add(new JButton("4"));
        c.add(new JButton("5"));
        c.add(new JButton("6"));
        c.add(new JButton("7"));
        c.add(new JButton("8"));
        c.add(new JButton("9"));

        setSize(500, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridColorHW();
    }
}
