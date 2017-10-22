package com.sample.OOPs.src;

class A
{
  int a=20;
  void display()
  {
      System.out.println("hai");
  }
}

class B extends A
{
    int b=30;
    void add()
    {
        int x=a+b;
        System.out.println(x);
    }
}

class C extends A
{
    int c=5;
    void sud()
    {
        int y=a-c;
        System.out.println(y);
    }
}

public class Intex1 {
    public static void main(String args[])
    {
        B q=new B();
        q.display();
        q.add();

    }
}
