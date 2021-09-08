package CodeChef;
import java.util.*;
public class reverse {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        while(n>0)
        {
            int number=scan.nextInt();
            int ans=0;
            while(number>0)
            {
                ans=(ans*10)+(number%10);
                number=number/10;
            }
            System.out.println(ans);
            n--;
        }
    }
}
