import java.util.*;
class MultiplicationTable
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value: ");
	int num=sc.nextInt();
	
	for(int i=1;i<=12;i++)
	{
	System.out.println(num + "X" + i +"="+(num*i));
	}
	}
}
	
	