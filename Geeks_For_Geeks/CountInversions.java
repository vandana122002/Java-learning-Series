package Geeks_For_Geeks;

public class CountInversions {


    public static long mergerSort(long[] nums,int a,int b)
    {
        long count=0;
        if(a<b)
        {
            int mid=(a+b)/2;
            count+=mergerSort(nums,a,mid);
            count+=mergerSort(nums,mid+1,b);
            count+=merge(nums,a,mid,b);
        }
        return count;
    }

    public static long merge(long[] nums,int s,int m,int e)
    {
        long count=0;
        long[] fh=new long[m-s+1];
        long[] sh=new long[e-m];


        for(int i=0;i<fh.length;i++)
        {
            fh[i]=nums[s+i];
        }

        for(int i=0;i<sh.length;i++)
        {
            sh[i]=nums[m+1+i];
        }

        int fhp=0,shp=0,i=s;
        while(fhp<fh.length&&shp<sh.length)
        {
            if(fh[fhp]>sh[shp])
            {
                count+=fh.length-fhp;
                nums[i]=sh[shp];
                shp++;
            }else
            {
                nums[i]=fh[fhp];
                fhp++;
            }
            i++;
        }

        while(fhp<fh.length)
        {
            nums[i]=fh[fhp];
            fhp++;
            i++;
        }
        while(shp<sh.length)
        {
            nums[i]=sh[shp];
            shp++;
            i++;
        }

        return count;
    }

    public static void main(String[] args)
    {
        long[] nums={5, 5, 5, 5, 5};
        System.out.println(mergerSort(nums,0,nums.length-1));
    }
}
