package Practice;

import java.util.*;
import java.lang.*;


class GFG {
    public static void main (String[] args) {
        //code
        int sum=0;
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> scores=new ArrayList<>();
        System.out.println("Enter the no of columns");
        int column=scan.nextInt();
        int[] Length=new int[column];
        System.out.println("Enter the length of columns");
        for(int i=0;i<Length.length;i++)
        {
            System.out.println("column length i is "+i);
            Length[i]=scan.nextInt();
        }
        System.out.println("Enter the score of students");
        for(int i=0;i<Length.length;i++)
        {
            System.out.println("i is "+i);
            for(int j=0;j<Length[i];j++)
            {
                System.out.println("j is "+j);
                sum=sum+scan.nextInt();
            }
            scores.add(sum);
            sum=0;
        }
        Collections.sort(scores);
        System.out.println("Max is "+scores.get(scores.size()-1));
        for(int i=0;i<scores.size();i++)
        {
            System.out.println("scores is "+scores.get(i));
        }
        System.out.println(Integer.MAX_VALUE);
    }
}
