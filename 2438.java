import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int N;
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
 
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
