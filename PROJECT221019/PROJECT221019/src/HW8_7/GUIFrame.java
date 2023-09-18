package HW8_7;

import javax.swing.*;
import java.awt.*;

public class GUIFrame extends JFrame {
    public GUIFrame() {
        setTitle("계산기 프레임");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        JPanel pn = new JPanel();
        JPanel ps = new JPanel();
        JPanel pc = new JPanel();

        pn.setBackground(Color.LIGHT_GRAY);
        ps.setBackground(Color.YELLOW);
        pc.setLayout(new GridLayout(4, 4));

        c.add(pc);
        c.add(pn, BorderLayout.NORTH);
        c.add(ps, BorderLayout.SOUTH);

        JLabel l1=new JLabel("수식입력");
        JTextField tf1=new JTextField(10);
        pn.add(l1);
        pn.add(tf1);

        JLabel l2=new JLabel("계산결과");
        JTextField tf2=new JTextField(10);
        ps.add(l2);
        ps.add(tf2);

        for(int i=0; i<16; i++) {
            JButton b=new JButton();
            String[] str= {"CE","계산","+","-","x","/"};
            pc.add(b);
            if(i<10) {
                b.setText(i+"");
            }else {
                b.setText(str[i-10]);
            }
            if(i>11) {
                b.setBackground(Color.CYAN);
                b.setOpaque(true);
            }
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new GUIFrame();
    }
}