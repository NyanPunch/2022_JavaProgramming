package HW8_8;

import javax.swing.*;
import java.awt.*;
class NorthPanel extends JPanel{ //상단 패널 영역
    public NorthPanel() {
        setBackground(Color.LIGHT_GRAY);
        add(new JButton("열기"));
        add(new JButton("닫기"));
        add(new JButton("나가기"));
    }
}
class CenterPanel extends JPanel{ //중단 패널 영역
    public CenterPanel() {
        setLayout(null);
        for (int i = 0; i < 10; i++) {
            int x = (int)(Math.random()*200);
            int y = (int)(Math.random()*200);
            JLabel label=new JLabel("*");
            label.setForeground(Color.RED);
            label.setLocation(x,y);
            label.setSize(20, 20);
            label.setOpaque(true);
            add(label);
        }
    }
}
class SouthPanel extends JPanel{ //하단 패널 영역
    public SouthPanel() {
        setBackground(Color.YELLOW);
        add(new JButton("Word Input"));
        add(new TextField(15));
    }
}
public class PanelsFrame extends JFrame {
    public PanelsFrame() {
        setTitle("여러 개의 패널을 가진 프레임");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        NorthPanel nP=new NorthPanel();
        CenterPanel nC=new CenterPanel();
        SouthPanel nS=new SouthPanel();
        add(nP, BorderLayout.NORTH);
        add(nS, BorderLayout.SOUTH);
        add(nC);

        setVisible(true);
    }

    public static void main(String[] args) {
        new PanelsFrame();
    }
}
