import java.util.*;

class FactorialRecursion
{


    static int recursiveFactorial(int n)
    {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * recursiveFactorial(n - 1);
    }


    static int iterativeFactorial(int n)
   {
        int fact = 1;
        for (int i = 1; i <= n; i++)
	 {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Factorial using Recursive method: "+ recursiveFactorial(num));

        System.out.println("Factorial using Non-Recursive method: "+ iterativeFactorial(num));


    }
}