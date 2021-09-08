package CodeChef;
import java.util.*;
public class Strong_Language {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        while(n-- >0)
        {
            long N=scan.nextInt();
            long K=scan.nextInt();
            scan.nextLine();
            String s=scan.nextLine();
            int count=0;
            boolean check=true;
            for(int i=0;i<s.length();i++)
            {
                if(count>=K)
                {
                    System.out.println("Yes");
                    check=false;
                }else
                {
                    if(s.charAt(i)=='*')
                    {
                        count++;
                    }else
                    {
                        count=0;
                    }
                }
            }
            if(check)
            {
                System.out.println("NO");
            }
        }
    }
}
