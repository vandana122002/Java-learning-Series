package AJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.*;

public class PT1 {
    public static void main(String[] args)
    {
        String[] s1={"MRU","NIT","IIT","IIIT","NSUT"};
        String[] date={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String[] month={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] year={"2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021"};

        JFrame frame=new JFrame();
        frame.setSize(500,500);


        JLabel l1=new JLabel("Registration form");
        JLabel l2=new JLabel("Full Name");
        JLabel l3=new JLabel("First name");
        JLabel l4=new JLabel("Last name");
        JLabel l5=new JLabel("University");
        JLabel l6=new JLabel("Email id");
        JLabel l7=new JLabel("DOB");
        JLabel l8=new JLabel("Gender");
        JLabel l9=new JLabel("Course Enrolled In");


        TextField t1=new TextField();
        TextField t2=new TextField();
        TextField t3=new TextField();
        TextField t4=new TextField();

        JRadioButton b1=new JRadioButton("Male");
        JRadioButton b2=new JRadioButton("Female");

       JComboBox j1=new JComboBox(s1);
        JComboBox JDate=new JComboBox(date);
        JComboBox JMonth=new JComboBox(month);
        JComboBox JYear=new JComboBox(year);

        j1.setSelectedIndex(-1);
        JDate.setSelectedIndex(-1);
        JYear.setSelectedIndex(-1);
        JMonth.setSelectedIndex(-1);

        ButtonGroup G = new ButtonGroup();
        G.add(b1);
        G.add(b2);

        JButton bu1=new JButton("Submit");
        JButton bu2=new JButton("Reset");


        frame.add(l1);
        frame.add(l2);
        frame.add(t1);
        frame.add(t2);


        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.add(j1);
        frame.add(l6);
        frame.add(t3);
        frame.add(l7);
        frame.add(JDate);
        frame.add(JMonth);
        frame.add(JYear);
        frame.add(l8);
        frame.add(b1);
        frame.add(b2);
        frame.add(l9);
        frame.add(t4);
        frame.add(bu2);
        frame.add(bu1);


          frame.setLayout(null);
          l1.setBounds(150,10,800,50);
          l2.setBounds(10,70,100,30);
          t1.setBounds(110,70,100,30);
          t2.setBounds(270,70,100,30);
          l3.setBounds(110,100,200,30);
          l4.setBounds(270,100,200,30);
          l5.setBounds(10,150,100,30);
          j1.setBounds(110,150,200,30);
          l6.setBounds(10,200,100,30);
          t3.setBounds(110,200,200,30);
          l7.setBounds(10,250,100,30);
          JDate.setBounds(110,250,100,30);
        JMonth.setBounds(250,250,100,30);
        JYear.setBounds(370,250,100,30);
        l8.setBounds(10,300,100,30);
        b1.setBounds(110,300,80,30);
        b2.setBounds(200,300,80,30);
        l9.setBounds(10,350,150,30);
        t4.setBounds(160,350,200,30);
        bu2.setBounds(100,400,100,30);
        bu1.setBounds(220,400,100,30);

        bu1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(t1.getText().length()==0||t2.getText().length()==0||t3.getText().length()==0||t4.getText().length()==0||G.getSelection().equals("null")|| JDate.getSelectedItem() == null || JYear.getSelectedItem() == null ||JMonth.getSelectedItem().equals("null")|| j1.getSelectedItem() == null)
                {
                    JOptionPane.showMessageDialog(frame,"Please Fill all the details","Alert",JOptionPane.WARNING_MESSAGE);
                }else if(!Pattern.matches("^[a-zA-z0-9]+[@]{1}+[a-zA-z0-9]+[.]{1}+[a-zA-z0-9]+$",t3.getText().trim()))
                {
                    JOptionPane.showMessageDialog(frame,"Invalid Email","Contact Number",JOptionPane.WARNING_MESSAGE);
                }

            }
        });

        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}
