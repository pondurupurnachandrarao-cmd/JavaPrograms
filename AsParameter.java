class AsParameter
{
    void display(AsParameter x)
    {
        System.out.println("Current object as Parameter");
    }

    void call()
    {
        display(this);   // passing current object as parameter
    }

    public static void main(String args[])
    {
        AsParameter obj = new AsParameter();
        obj.call();
    }
}