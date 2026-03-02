class OverloadConstructor
{
    int age;
    String name;

    // Default Constructor
    OverloadConstructor()
    {
        age = 20;
        name = "Purna";
    }

    // Parameterized Constructor
    OverloadConstructor(int a, String n)
    {
        age = a;
        name = n;
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String args[])
    {
        OverloadConstructor obj = new OverloadConstructor(20, "Ajay");
        obj.display();
    }
}