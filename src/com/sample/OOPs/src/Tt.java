package com.sample.OOPs.src;

abstract class T4 {
    abstract void add();
    void sub(){

        System.out.print("hi");
    }
}

/*class Tl extends T4 {
    int q=10;
    int p=10;
    void add()
    {
        System.out.println("Add is "+(p+q));
    }
}*/
public class Tt
{
    public static void main(String args[])
    {
        T4 t=new T4();
       // t.add();
        t.sub();
    }
}
