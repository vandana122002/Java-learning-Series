////
////import java.lang.reflect.Array;
////import java.util.*;
////
////class c
////{
////
////}
////class A extends c
////{
////
////}class B extends A
////{
////
////}
////public class check
////{
////    public static void main(String[] args)
////    {
////        A s=new B();
////
////        if(s instanceof B)
////        {
////            System.out.println("y");
////        }else
////        {
////            System.out.println("3");
////        }
//////        Scanner scan=new Scanner(System.in);
//////        int n=scan.nextInt();
//////        scan.nextLine();
//////        ArrayList<String> a=new ArrayList<>();
//////        while(n-->0)
//////        {
//////            String ch=scan.nextLine();
//////            String[] words=ch.split(" ");
//////            int j=ch.length()-1;
//////            for(int i=ch.length()-1;i>=0;i--)
//////            {
//////                if(ch.charAt(i)==' ')
//////                {
//////                    a.add(ch.substring(i+1,j+1));
//////                    j=i-1;
//////                }
//////            }
//////            a.add(ch.substring(0,j+1));
//////            for(String i:a)
//////            {
//////                System.out.print(i+" ");
//////            }
//////        }
////
////    }
////}
//
//
//
//class Animal {
//
//    static void method(Animal a) {
//        if (a instanceof Animal) {
//            System.out.println("ok downcasting performed");
//
//        }
//    }
//}
//public class check extends Animal{
//
//
//    public static void main (String [] args) {
//        Animal a=new check();
//        System.out.println(a instanceof Animal);
//        check.method(a);
//    }
//
//}




public class check
{        String s;
    public static void main(String[] args)
    {
        check c1=new check();
        char c=0XFace;
        System.out.println(c);

        int a=0100;
        System.out.println(a);

        double d=0XFace;
        System.out.println(d);
        int[] n=new int[9];


        System.out.println(c1.s);
    }
}