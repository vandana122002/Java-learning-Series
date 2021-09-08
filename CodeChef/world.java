package CodeChef;
import java.util.*;
public class world {
    public static double Precision(double value)
    {
        float value2 = (int)(value * 100 + .5);
        float ans=(float)value2 / 100;
        String value1=String.valueOf(ans);
        return Double.valueOf(value1);
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        while(n>0)
        {
            double a=scan.nextDouble();
            double b=scan.nextDouble();
            double c=scan.nextDouble();
            double d=scan.nextDouble();
            double value=100/(a*b*c*d);

            if(Precision(value)<9.58)
            {
                System.out.println("YES");
            }else
            {
                System.out.println("NO");
            }
            n--;
        }
    }
}
