package Practice;

import java.util.*;
public class loops {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        double ans=0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            if(i==0)
            {
                ans=a+Math.pow(2,i)*b;
                System.out.print(ans);
            }else{
                ans=ans+Math.pow(2,i)*b;
                System.out.print(ans);
            }
        }
        in.close();
    }
}
