package Practice;
import java.util.*;

public class Union
{
    public static void main(String[] args)
    {
       List<s> std=new ArrayList<>();
       std.add(new s(30,"Rakhi"));
        std.add(new s(30,"Vandana"));
        std.add(new s(33,"Aditi"));
        std.add(new s(30,"Shivangi"));

        Collections.sort(std, new Comparator<s>() {
            @Override
            public int compare(s o1, s o2) {
                System.out.println(o1.getName());
                System.out.println(o2.getName());

                if (o1.getName().equals(o2.getName())) {
                    return o1.getMarks() - o2.getMarks();
                }
                return o1.getName().compareTo(o2.getName());
            }
        });
        for(s i:std)
        {
            System.out.println(i.getMarks());
            System.out.println(i.getName());
        }
    }
}