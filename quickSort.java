import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.*;

public class quickSort {
        static void swap(int[] arr,int i,int j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        static int partitiion(int[] arr,int l,int h)
        {
            int start=l;
            int end=h,pivot=arr[l];
            while(start<end)
            {
                while(start<arr.length&&pivot>=arr[start]) {
                    start++;

                }
                while(pivot<arr[end]) {
                    end--;
                }

                if(start<end)
                {
                    swap(arr,start,end);
                }

            }
            swap(arr,l,end);
            return end;
        }

        static void quickSort(int[] arr,int l,int h)
        {
            if(l<h) {
                int pivot = partitiion(arr, l, h);
                quickSort(arr, l, pivot - 1);
                quickSort(arr, pivot + 1, h);
            }
        }
    public static void main(String[] args)
    {
        int[] arr={5,4,3,2,1};
        quickSort(arr,0,arr.length-1);
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
