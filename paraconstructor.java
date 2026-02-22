class paraconstructor
{
	String name;
	int age;

	paraconstructor(String n, int a){
		name=n;
		age=a;
	}
	public static void main(String args[])
	{
		paraconstructor obj=new paraconstructor("Purna",20);
		System.out.println("Your Name:"+ obj.name+"\n"+"Your Age:"+obj.age);
	}
}
	