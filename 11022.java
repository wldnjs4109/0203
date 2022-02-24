import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int A,B,C,T;
		Scanner s=new Scanner(System.in);
		T=s.nextInt();
 
		for(int i=1;i<=T;i++) {
			A=s.nextInt();
			B=s.nextInt();
			C=A+B;
			System.out.println("Case #"+i+": "+A+" + "+B+" = "+C);
		}
	}
}
