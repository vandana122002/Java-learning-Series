package Practice;

public class sort{
    static void merge(int[] arr,int l,int mid,int r)
    {
        int n1=mid-l+1;
        int n2=r-mid;
        int[] a=new int[n1];
        int[] b=new int[n2];
        for(int i=0;i<n1;i++)
        {
            a[i]=arr[i];
        }
        for(int i=0;i<n2;i++)
        {
            b[i]=arr[mid+i+1];
        }
        int i=0,j=0,k=0;
        while(i<n1&&j<n2)
        {
            if(a[i]<b[j])
            {
                arr[k]=a[i];
                k++;
                i++;
            }else
            {
                arr[k]=b[j];
                k++;
                j++;
            }
        }
        while(i<n1)
        {
            arr[k]=a[i];
            k++;
            i++;
        }
        while(j<n2)
        {
            arr[k]=b[j];
            k++;
            j++;
        }
    }
    static void mergeSort(int[] arr,int l,int r)
    {
        if(l<r)
        {
            int mid=(l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);

            merge(arr,l,mid,r);
        }
    }
    public static void main(String[] args)
    {
        int[] arr={2,4,6,7,1,8,9};
        mergeSort(arr,0,arr.length-1);
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
