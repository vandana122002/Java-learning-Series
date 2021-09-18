package Geeks_For_Geeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class meeting implements Comparable<meeting>
{
    int start;
    int end;
    int pos;
    meeting(int start,int end,int pos)
    {
        this.start=start;
        this.end=end;
        this.pos=pos;
    }

    @Override
    public int compareTo(meeting o) {
        if(this.end<o.end)
            return -1;
        else if(o.end<this.end)
            return 1;
        else
            if(this.pos<o.pos)
                return -1;
            else
                return 1;
    }
}


public class NMeetingInOneRoom {
    public static void main(String[] args)
    {
        int start[] = {10, 12, 20};
        int end[] = {20, 25, 30};
        ArrayList<meeting> a=new ArrayList<>();
        for(int i=0;i<start.length;i++)
        {
            a.add(new meeting(start[i],end[i],i+1));
        }

        Collections.sort(a);

        for(meeting i:a)
        {
            System.out.println(i.start+" "+i.end+" "+i.pos);
        }

        int count=1;
        int min_limit=a.get(0).end;
        for(int i=1;i<start.length;i++)
        {
            if(a.get(i).start>min_limit)
            {
                min_limit=a.get(i).end;
                count++;
            }
        }

        System.out.println(count);
    }
}
