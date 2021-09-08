package CodeChef;
import java.util.*;
public class valid_pair {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int first=scan.nextInt();
        int second=scan.nextInt();
        int third=scan.nextInt();
        if(first==second)
        {
            System.out.println("YES");
        }else if(first==third)
        {
            System.out.println("YES");
        }else if(second==third)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
