import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int A,B,T;
		Scanner s=new Scanner (System.in);
		T=s.nextInt();
 
 
		for(int i=0;i<T;i++){
			A=s.nextInt();
			B=s.nextInt();
			System.out.println(A+B);
		}
	}
}
