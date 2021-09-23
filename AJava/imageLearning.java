package AJava;


import javax.swing.*;
import java.awt.*;

public class imageLearning extends Canvas{

    public static void main(String[] args) {
        JFrame f=new JFrame();
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("../Images/a,jpg"));
        Image i1=i.getImage().getScaledInstance(100,500,Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(i1);

        f.setSize(400,400);
        f.setVisible(true);
    }

}
