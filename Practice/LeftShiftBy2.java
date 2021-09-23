package Practice;

public class LeftShiftBy2 {
    public static void main(String[] args)
    {
        int x=0;
        while((1<<x)<=10)
        {
            System.out.println(1<<x);
            x++;
        }
    }
}
