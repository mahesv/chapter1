package com.sample.OOPs.src;

class Parent
{
    int a=10,b=20;
    void add()
    {
        int c=a+b;
        System.out.println(c);
    }

}

class Child extends Parent
{
    void mul()
    {
        int c=b*a;
        System.out.println(c);
    }

}

public class intex {
    public static void main(String args[])
{
    Child s=new Child();
    s.add();
    s.mul();
}

}
