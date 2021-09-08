package AJava;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class tree {
    public static void main(String[] args)
    {
        JFrame frame=new JFrame("Tree");
        JTree tree;
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("Manvi Arora");
        DefaultMutableTreeNode rl=new DefaultMutableTreeNode("Personal");
        DefaultMutableTreeNode rr=new DefaultMutableTreeNode("Academic");
        DefaultMutableTreeNode rll=new DefaultMutableTreeNode("Manvi Arora");
        DefaultMutableTreeNode rlr=new DefaultMutableTreeNode("1089");
        DefaultMutableTreeNode rrl=new DefaultMutableTreeNode("6.5 CGPA");
        DefaultMutableTreeNode rrr=new DefaultMutableTreeNode("8.8 CGPA");
        root.add(rl);
        root.add(rr);
        rl.add(rll);
        rl.add(rlr);
        rr.add(rrl);
        rr.add(rrr);
        tree=new JTree(root);
        frame.add(tree);

        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
