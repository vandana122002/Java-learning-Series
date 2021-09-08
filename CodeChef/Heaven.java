package CodeChef;

import java.io.*;


public class Heaven {
    public static void main(String[] args) throws IOException {
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(read.readLine().trim());
        while(T-->0)
        {
            double L=Double.parseDouble(read.readLine().trim());
            String s=read.readLine();
            long zeros=0,ones=0,d=1;
            for(int i=0;i<s.length();i++)
            {
                 if(s.charAt(i)=='1')
                 {
                   ones++;
                 }else
                 {
                     zeros++;
                 }
                 if(ones>=zeros)
                 {
                     System.out.println("YES");
                     d=0;
                     break;
                 }
            }
            if(d==1)
            {
                System.out.println("NO");
            }
        }
    }
}
