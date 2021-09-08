package Practice;


class  Polygon
{
    void display()
    {
        System.out.println("Hello");
    }
}
public class anonymous {
    public static void main(String[] args)
    {
        Polygon p1=new Polygon()
        {
            public void display()
            {
                System.out.println("rakhi");
            }
        };
        p1.display();
    }
}
