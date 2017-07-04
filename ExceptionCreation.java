import java.util.*;
import java.io.*;

class negativeException extends Exception
{
	public String getMessage()
	{
		return "n and p should be non-negative";
	}
}
class Calculator 
{
	int power(int n,int p) throws negativeException
	{
		if(n<0||p<0)
		{
			throw new negativeException();
		}
		else if(n==0)
			return 0;

		else if(p==0)
			return 1;
		else
		{
			int r=1;
			for(int i=1;i<=p;i++)
				r=r*n;
			return r;
		}
	}
}

public class ExceptionCreation 

{

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter no of test cases");

		int t = in.nextInt();

		while (t-- > 0) {

			System.out.println("Enter n,p");

			int n = in.nextInt();

			int p = in.nextInt();

			Calculator myCalculator = new Calculator();

			try
			{
				int ans = myCalculator.power(n, p);

				System.out.println("n to the power p is:");
				System.out.println(ans);
			}
			catch (Exception e) 
			{
				System.out.println(e.getMessage());
			}
		}
		in.close();
	}
}
