package com.sample.Ds;

import java.util.*;
class Sort
{
    void Sort(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n-i); j++) {
                if (a[j-1] > a[j]) {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    void display(int a[])
    {
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
public class BubbleSort {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int no=s.nextInt();
        int a[]=new int[no];
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        Sort so=new Sort();
        so.Sort(a);
        so.display(a);
    }
}

