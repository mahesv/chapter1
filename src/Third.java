public class Third
{
    public String first = "instance";
    public void InitOrder()
    {
        first = "constructor";
    }
    void a()
    { first = "block";
    }
    public void print()
    {
        System.out.println(first);
    }
    public static void main(String... args)
    {    new Third().print();
    }
}
