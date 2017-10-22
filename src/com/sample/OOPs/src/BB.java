package com.sample.OOPs.src;

public class BB {
    private String s;
    private int i;

    public String gets()
    {
        return s;
    }
   public void Sets(String s)
    {
        this.s=s;
    }
    public int getsi()
    {
        return i;
    }
    public void Seti(int i)
    {
        this.i=i;
        if(i<10)
        {
            System.out.println(gets());
            System.out.println(getsi());
            System.out.println("Correct");

        }
        else
        {
            System.out.println("Wrong option");
        }
    }
}
