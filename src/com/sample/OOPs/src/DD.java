package com.sample.OOPs.src;

class First
{ int c;
    void add(int a,int b)
    {

        c=a+b;
        System.out.println(c);
    }
}

class Second extends First
{
    void add(int a,int b)
    {

        c=a+b;
        System.out.println(c);
    }
}

public class DD
{
    public static void main(String args[])
    {
        First f=new First();
        Second s=new Second();
        f.add(10,10);
        s.add(20,20);
    }

}
