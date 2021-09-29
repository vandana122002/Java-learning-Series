package Learning_New_Concepts;

public class New_Concept_of_Var_Args {
    public static void m1(int... x)
    {
        System.out.println("...x");
    }

    //error will be there in
//    public static void m1(int[] x)
//    {
//        System.out.println("...x");
//    }
    public static void m1(int x)
    {
        System.out.println("[] x");
    }
    public static void main(String[] args)
    {

    }
}
