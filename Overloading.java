class Overloading
{
    int add(int a, int b)
    {
        return a + b;
    }

    int add(int a, int b, int c)
    {
        return a + b + c;
    }

    float add(float a, float b)
    {
        return a + b;
    }

    public static void main(String args[])
    {
        Overloading obj = new Overloading();

        System.out.println("Sum of two integers: " + obj.add(5, 6));
        System.out.println("Sum of three integers: " + obj.add(5, 6, 7));
        System.out.println("Sum of two floats: " + obj.add(5.6f, 7.9f));
    }
}