package Practice;

import com.sun.security.jgss.GSSUtil;

public class starPattern {
    public static void main(String[] args)
    {
        for(int i=5;i>0;i--)
        {
            for(int j=0;j<5;j++) {
                if (j + 1 < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
