package com.sample.Ds;
import java.util.Scanner;
class Sort
{
    void Sort(int a[])
    {
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            int min=i;
            for(int j=1;j<n;j++)
            {
                if(a[j]<a[i])
                {
                    int temp=a[j];
                    a[i]=a[j];
                    a[j]=temp;
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
public class SelectionSort {
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
