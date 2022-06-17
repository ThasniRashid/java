<<<<<<< HEAD
import java.util.*;
import java.io.*;
public class MyClass
{
	public static void main(String args[]) 
	{
       	int i;
        	try 	
		{
            	FileOutputStream fdd=new FileOutputStream("dataodd.txt");
            	FileInputStream fin=new FileInputStream("data.txt");
            	FileOutputStream feven=new FileOutputStream("dataeven.txt");
            	while((i=fin.read())!=-1)
            	{
                		if(i%2==0)
                		feven.write(i);
                		else
                		fdd.write(i);
            	}
            	fdd.close();
            	fin.close();
            	feven.close();
        	} 
		catch(Exception e) 
		{
          		System.out.println("There are some IOException");
        	}
        
    }
=======
import java.util.*;
import java.io.*;
public class MyClass
{
	public static void main(String args[]) 
	{
       	int i;
        	try 	
		{
            	FileOutputStream fdd=new FileOutputStream("dataodd.txt");
            	FileInputStream fin=new FileInputStream("data.txt");
            	FileOutputStream feven=new FileOutputStream("dataeven.txt");
            	while((i=fin.read())!=-1)
            	{
                		if(i%2==0)
                		feven.write(i);
                		else
                		fdd.write(i);
            	}
            	fdd.close();
            	fin.close();
            	feven.close();
        	} 
		catch(Exception e) 
		{
          		System.out.println("There are some IOException");
        	}
        
    }
>>>>>>> 434273f5726d83534b04f6840316d472310b11cb
}