package Geeks_For_Geeks;
import java.util.*;
public class check
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();
        for(int a=0;a<n;a++)
        {
            int N=scan.nextInt();
            int goodness=scan.nextInt();
            scan.nextLine();
            String s=scan.nextLine();
            int k=0;
            int per=0;
            for(int i=0;i<N/2;i++)
            {
                if(s.charAt(i)!=s.charAt((N-1)-i))
                {
                    k++;
                }else
                {
                    per++;
                }
            }
//            System.out.println("good"+k);
//            System.out.println("per"+per);
            if(k==goodness)
            {
                System.out.println("Case #"+a+": 0");
            }else
            {
                int remGood=goodness-k;
                System.out.println("Case #"+a+": "+remGood);
            }
        }
    }
}