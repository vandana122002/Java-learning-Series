package Practice;
import java.io.*;
public class NewWayOfTakingInput {
    public static void main(String[] args) throws IOException
    {
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(read.readLine());
        while(T-->0)
        {
            int a=Integer.parseInt(read.readLine());
            System.out.println(a);
            String[] s =read.readLine().trim().split(" ");
            for(String i:s)
            {
                System.out.println(i);
            }
        }
    }
}
