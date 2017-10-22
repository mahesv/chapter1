package com.sample.OOPs.src;

class D
{
    int x, y, z, b;

    D() {
        System.out.print("constructor");
    }

    D(int x, int y) {
        this.x = x;
        this.y = y;
        z = x + y;
        System.out.print(z);
    }

    D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        b = x + y + z;
        System.out.print(b);
    }

}

class CC
{
    public static void main(String args[])
    {
        D d=new D();
        D f=new D(5,10);
        D g=new D(5,10,20);

    }
}
