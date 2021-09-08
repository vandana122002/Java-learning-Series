package Practice;

import java.lang.reflect.*;
public class max {
    public static void main(String[] args)
    {
        student s1=new student();
        Class c1=s1.getClass();
        Method m[]=c1.getDeclaredMethods();
        for(Method method:m)
        {
            System.out.println(method.getName());
        }
        Field f[]=c1.getDeclaredFields();
        for(Field field:f)
        {
            System.out.println(field.getName());
        }
    }
}

class student
{
    String name;
    int roll_no;
    public void setrollno(int roll_no)
    {
        this.roll_no=roll_no;
    }    public void setname(String name)
    {
        this.name=name;
    }    public int  getrollno()
    {
       return roll_no;
    }    public String getname(String name)
    {
        return name;
    }
}