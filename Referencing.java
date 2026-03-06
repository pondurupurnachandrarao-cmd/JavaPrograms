class Referencing
{
    int x;

    Referencing(int x)
    {
        this.x = x;   // referencing current class variable
    }

    void display()
    {
        System.out.println("x value is: " + x);
    }

    public static void main(String args[])
    {
        Referencing obj = new Referencing(10);
        obj.display();
    }
}