public class Person {
    public Person youngestChild;
    public static void main(String... args)
    {
        Person elena = new Person();
        Person diana = new Person();
        elena.youngestChild = diana;
        diana = null;
        Person zoe = new Person();
        elena.youngestChild = zoe;
        zoe = null;
    }
}
