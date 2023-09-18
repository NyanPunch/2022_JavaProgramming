package OpenChallenge8;

import javax.swing.*;
import java.awt.*;

public class SwingFrame extends JFrame {
    public SwingFrame() {
        setTitle("Open Challenge 9");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        c.add(new NorthPanel(), BorderLayout.NORTH);
        c.add(new CenterPanel(), BorderLayout.CENTER);
        setSize(300,300);
        setVisible(true);
    }

    class NorthPanel extends JPanel {
        public NorthPanel() {
            setBackground(Color.LIGHT_GRAY); // 배경 색상
            setLayout(new FlowLayout());
            add(new JButton("Open"));
            add(new JButton("Read"));
            add(new JButton("Close"));
        }
    }

    class CenterPanel extends JPanel {
        public CenterPanel() {
            setLayout(null);

            JLabel a = new JLabel("Hello");
            a.setSize(100,20);
            a.setLocation(100, 30); // 임의 위치 선정

            JLabel b = new JLabel("Java");
            b.setSize(100,20);
            b.setLocation(200, 150); // 임의 위치 선정

            JLabel c = new JLabel("Love");
            c.setSize(100,20);
            c.setLocation(20, 120); // 임의 위치 선정

            // 3개의 레이블 생성
            add(a);
            add(b);
            add(c);
        }
    }

    static public void main(String[] arg) {
        new SwingFrame();
    }
}
