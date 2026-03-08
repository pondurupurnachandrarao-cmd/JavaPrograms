class CallingCurrentClassMethod
{
    void show()
    {
        System.out.println("show method is invoked");
    }

    void display()
    {
        show();   // calling current class method
        System.out.println("display method is invoked");
    }

    public static void main(String args[])
    {
        CallingCurrentClassMethod obj = new CallingCurrentClassMethod();
        obj.display();
    }
}