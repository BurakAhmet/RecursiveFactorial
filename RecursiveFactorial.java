import java.util.*;
public class RecursiveFactorial {
	public static void main(String[] argh)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to calculate the factorial");
		int num = sc.nextInt();
		System.out.println("Result: "+factorial(num));
	}
	public static long factorial(int n) {
		   if (n == 0)
		     return 1;
		   else
		     return n * factorial(n - 1);
		 }
	public static long factorial(int a, int b)
	{
		if(a==1) 
		{
			return b;
		}
		else return factorial(a-1, b*a);
	}
		  
}
	