import java.io.*;
import java.util.*;
class number
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number a");
		int a=s.nextInt();
		System.out.println("enter the number b");	
				int b=s.nextInt();
				System.out.println("enter the number c");
				int c=s.nextInt();
       if(a>c&&b>c)

             System.out.print("a is greater");

             else if(b>c)

	       System.out.print("b is greater");

        else
          System.out.print("c is greater");
	}
}
	
