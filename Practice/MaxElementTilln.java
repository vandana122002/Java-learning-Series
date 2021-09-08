package Practice;

import java.util.Stack;

public class MaxElementTilln {
    public static void main(String[] args)
    {
        int[] arr={23,34,21,33,23};
        Stack<Integer> s=new Stack<>();
//        boolean check=true;
        for(int i=0;i<arr.length;i++)
        {
            while(!s.empty()&&arr[s.peek()]<arr[i])
            {
                arr[s.pop()]=arr[i];
            }
            s.push(i);
        }
        while(!s.empty())
        {
            arr[s.pop()]=-1;
        }
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
