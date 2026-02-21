class defconstructor
{
	String name;
	int age;

	defconstructor(){
		name="Purna";
		age=20;
	}
	public static void main(String args[])
	{
		defconstructor obj=new defconstructor();
		System.out.println("Your Name:"+ obj.name+"\n"+"Your Age:"+obj.age);
	}
}
	