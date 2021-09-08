package Practice;

import java.io.*;
import java.util.*;

public class watermelon{
    public static void main(String[] args) throws IOException {
        try {
            Scanner scan=new Scanner(System.in);
            int weight=scan.nextInt();
            //Your Solve
            int ans=0;
            ArrayList<Integer> allNum=new ArrayList<>();
            for(int i=1;i<weight;i++)
            {
                if(i%2==0)
                {
                    allNum.add(i);
                }
            }
            for(int i=0;i<allNum.size();i++)
            {
                for(int j=0;j<allNum.size();j++)
                {
                    if(allNum.get(i)+allNum.get(j)==weight)
                    {
                        ans=1;
                        break;
                    }
                }

            }
            if(ans==1)
            {
                System.out.println("YES");
            }else
            {
                System.out.println("NO");
            }

        } catch (Exception e) {
            return;
        }
    }

}


