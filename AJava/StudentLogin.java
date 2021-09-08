package AJava;

import javax.swing.*;
import java.awt.*;

public class StudentLogin {
    public static void main(String[] args)
    {
        JFrame jf=new JFrame("Login");
        JLabel l=new JLabel("Applet");
        JPanel p=new JPanel();
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
//        p.setSize(10,10);
        p2.setLayout(new GridLayout(1,2));
        p.add(l);
        JLabel l1=new JLabel("Username");
        JTextField t1=new JTextField();
        JLabel l2=new JLabel("Password");
        JTextField t2=new JTextField();
        p3.add(l2);
        p3.add(t2);
        p3.setLayout(new GridLayout(1,2));
        jf.setLayout(new GridLayout(3,0));

        jf.add(p);
        p2.add(l1);
        p2.add(t1);
        jf.add(p2);
        jf.add(p3);
        jf.setSize(300,200);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);

    }
}
