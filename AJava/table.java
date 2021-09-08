package AJava;

import javax.swing.*;
import java.awt.*;


// frame
//public class table{
// JFrame f;
//         // Table
//         JTable j;
//
//         // Constructor
//         table()
//         {
//         // Frame initiallization
//         f = new JFrame();
//
//         // Frame Title
//         f.setTitle("JTable Example");
//
//         // Data to be displayed in the JTable
//         String[][] data = {
//         { "Kundan Kumar Jha", "4031", "CSE" },
//         { "Anand Jha", "6014", "IT" }
//         };
//
//         // Column Names
//         String[] columnNames = { "Name", "Roll Number", "Department" };
//
//         // Initializing the JTable
//         j = new JTable(data, columnNames);
//         j.setBounds(30, 40, 200, 300);
//
//         // adding it to JScrollPane
//         JScrollPane sp = new JScrollPane(j);
//         f.add(sp);
//         // Frame Size
//         f.setSize(500, 200);
//         // Frame Visible = true
//         f.setVisible(true);
//         }
//
//// Driver method
//public static void main(String[] args)
//        {
//        new table();
//        }
//}
public class table {
    public static void main(String[] args)
    {
        JFrame jf=new JFrame("Table");
        JTable table;
        String[] header={"Name","Semester","Roll No"};
        String[][] a={
                {"Rakhi","3","1105"},
                {"Swati","3","1118"},
                {"Jiya","2","1086"}};
        table=new JTable(a,header);

        jf.add(table);
        jf.add(table.getTableHeader(), BorderLayout.NORTH);
        jf.add(table, BorderLayout.CENTER);

        jf.setSize(200,200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);


    }
}
