//import Java_ds_algo.Java.Linkedlist;
//
//import java.util.LinkedList;
//import java.util.PriorityQueue;
//
//class check1 {
//    private int a;
//    private int b;
//    check1(int a,int b)
//    {
//        this.a=a;
//        this.b=a;
//    }
//    void display()
//    {
//        System.out.println("K is "+a+"M is "+b);
//    }
//
//    class inner
//    {
//        void display()
//        {
//            System.out.println("Display");
//        }
//    }
//}
//
//public class check{
//    public static void main(String[] args)
//    {
//        LinkedList<check1>[] a=new LinkedList[4];
//        for(int i=0;i<4;i++)
//        {
//            a[i]=new LinkedList<>();
//        }
//        a[0].add(new check1(2,3));
//        a[0].add(new check1(6,7));
//        a[1].add(new check1(4,5));
//        a[1].add(new check1(8,9));
//
//
//        for(LinkedList<check1> c:a)
//        {
//            for(check1 j:c)
//            {
//                j.display();
//            }
//        }
////        int a=10,b=4;
////        check1 c=new check1(a,b);
////        c.display();
////        check1.inner i=c.new inner();
//
//    }
//}

interface a
{
    public void x();
}


public class check
{
    public void a(a x)
    {
        System.out.println("h");
    }
    public static void main(String[] args)
    {

    }
}