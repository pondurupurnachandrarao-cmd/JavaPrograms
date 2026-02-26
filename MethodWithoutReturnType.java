class MethodWithoutReturnType
{
    void square(int n)
    {
        System.out.println("Square = " + (n * n));
    }

    public static void main(String args[])
    {
        MethodWithoutReturnType obj = new MethodWithoutReturnType();
        obj.square(5);
    }
}