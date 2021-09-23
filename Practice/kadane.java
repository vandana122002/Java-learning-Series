package Practice;

public class kadane {

    static void maxSubArraySum(int a[])
    {
        int msf = Integer.MIN_VALUE,
                meh = 0,start = 0,
                end = 0, s = 0;

        for (int i = 0; i < a.length; i++)
        {
            meh+= a[i];

            if (msf < meh)
            {
                msf = meh;
                start = s;
                end = i;
            }

            if (meh < 0)
            {
                meh = 0;
                s = i + 1;
            }
        }
        System.out.println(msf);
    }

    // Driver code
    public static void main(String[] args)
    {
        int a[] = { -2,1,-3,4,-1,2,1,-5,4 };
        maxSubArraySum(a);
    }
}