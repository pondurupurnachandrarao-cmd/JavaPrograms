class AnotherConstructor
{
    AnotherConstructor()
    {
        System.out.println("Default Constructor");
    }

    AnotherConstructor(int x)
    {
        this();   // calling another constructor
        System.out.println("Parameterized Constructor : " + x);
    }

    public static void main(String args[])
    {
        AnotherConstructor obj = new AnotherConstructor(33);
    }
}