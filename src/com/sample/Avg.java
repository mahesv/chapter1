package com.sample;

public class Avg {
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5};
            int temp1[]= new int[6];
        int num=0;
        for(int i=0;i<a.length;i++)
        {
            num=num+a[i];
        }
        num=num/a.length;
        System.out.println(num);


       for(int i=0;i<a.length;i++)
       {
           temp1[i]=a[i];
       }
       a=temp1;
       System.out.println(a.length);
       System.out.print(a[5]);
    }
}
