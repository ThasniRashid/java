import java.util.*;
class swap2
{
		public static void main(String args[])
		{
			Scanner obj=new Scanner(System.in);
			System.out.print("Enter the value of A: ");
			int a=obj.nextInt();
			System.out.print("Enter the value of b: ");
			int b=obj.nextInt();
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("swap A:"+a+" swap B:"+b);
		}
}
			
		