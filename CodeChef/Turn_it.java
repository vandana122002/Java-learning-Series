package CodeChef;
import java.util.*;
public class Turn_it {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        while(n>0)
        {
            int U=scan.nextInt();
            int V=scan.nextInt();
            V=V*V;
            int A=scan.nextInt();
            int S=scan.nextInt();
            double v=0;
            v=(U*U)-2*A*S;
            if(V>=v)
            {
                System.out.println("Yes");
            }else
            {
                System.out.println("No");
            }
            n--;
        }
    }
}
