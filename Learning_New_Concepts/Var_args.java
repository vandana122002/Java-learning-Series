package Learning_New_Concepts;

public class Var_args {
    public static int sum(int... args)
    {
        int total=0;
        for(int i:args)
        {
            total+=i;
        }
        return total;
    }
    public static void main(String[] args)
    {
        System.out.println("Sum is "+sum());
        System.out.println("Sum is "+sum(10));
        System.out.println("Sum is "+sum(10,20));
        System.out.println("Sum is "+sum(10,20,30));
        System.out.println("Sum is "+sum(10,20,30,40));
    }
}
