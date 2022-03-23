import java.util.*;
class fib
{
	public static void main(String args[])
	{
		int max=10,first=0,second=1,i=1;
		System.out.println("Fibonacci series of "+max+" numbers: ");
		while(i<=max)
		{
			System.out.println(first+"  ");
			int sum=first+second;
			first=second;
			second=sum;
			i++;
		}
	}
}