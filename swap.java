import java.util.*;
class swap
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the value of A: ");
		int a=obj.nextInt();
		System.out.print("Enter the value of b: ");
		int b=obj.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println("Value in A: "+a);
		System.out.println("Value in B: "+b);
	}
}
	
	