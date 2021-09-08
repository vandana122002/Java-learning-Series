package Practice;

import Java_ds_algo.Java.Linkedlist;

import java.util.LinkedList;

class Hashmap<K,Y> {
    private class HashNode
    {
        K key;
        Y value;
        HashNode(K key,Y value)
        {
            this.key=key;
            this.value=value;
        }
    }

    LinkedList<HashNode>[] buckets;
    private int size;
    public Hashmap(int n)
    {
        bucketsSize(n);
        size=0;
    }

    void bucketsSize(int n)
    {
        buckets=new LinkedList[n];
        for(int i=0;i<n;i++)
        {
            buckets[i]=new LinkedList<>();
        }
    }

    void put(K key,Y value)
    {
        int bn=hashmap(key);
        int nn=getIndexWithinBucket(key,bn);

        if(nn!=-1)
        {
            buckets[bn].get(nn).value=value;
        }else
        {
            buckets[bn].add(new HashNode(key,value));
            size++;
            System.out.println("size "+size);
        }
    }

    Y get(K key)
    {
        int bn=hashmap(key);
        int nn=getIndexWithinBucket(key,bn);

        if(nn!=-1)
        {
            return buckets[bn].get(nn).value;
        }else
        {
            return null;
        }
    }
    private int hashmap(K key)
    {
        int k=key.hashCode();
        System.out.println("hash code "+k);
        return Math.abs(k)%buckets.length;
    }

    private int getIndexWithinBucket(K key,int bi)
    {
        int ni=0;
        for(HashNode n:buckets[bi])
        {
            if(n.key.equals(key))
            {
                return ni;
            }
            ni++;
        }
        return -1;
    }


}

public class LearningHashmap
{
    public static void main(String[] args)
    {
       Hashmap<Integer,Integer> l=new Hashmap<Integer, Integer>(4);
        l.put(2,3);
        l.put(5,6);

        System.out.println(l.get(2));
        System.out.println(l.get(5));
//        System.out.println(l.get(9));
    }
}
