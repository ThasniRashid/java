import java.util.*;
class complex
{
	double real, img;
    	double Complex(int r,int i)
	{
        	real=r;
       	 	img=i;
    	}
	Complex addComp(Complex C1,Complex C2)
	{
        	Complex obj = new Complex(0,0);
        	obj.real=C1.real+C2.real;
        	obj.img=C1.img+C2.img;
        	return obj;
    	}
}

class ComplexMain
{
	public static void main(String args[])
	{
        	System.out.println("Complex number 1 : " +C1.real+ " + " +C1.img+ "i");
        	System.out.println("Complex number 2 : " +C2.real+ " + " +C2.img+ "i");
        	complex C3=C3.addComp(C1,C2);
        	System.out.println("Sum of complex numbers : " +C3.real+ " + " +C3.img+ "i");
    	}
}
	
