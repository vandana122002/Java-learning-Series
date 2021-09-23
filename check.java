
import java.util.*;



public class check
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(n);
        scan.nextLine();
        while(n-->0)
        {
            String ch=scan.nextLine();
            String[] words=ch.split(" ");
            Collections.reverse(Arrays.asList(words));

            for(String i:words)
            {
                System.out.print(i+" ");
            }
        }

    }
}