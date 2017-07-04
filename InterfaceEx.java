import java.io.*;
import java.util.*;

/**
*          JAVA PROGRAM TO FING SUM OF DIVISORS BY IMPLEMENTING INTERFACE
**/
interface AdvancedArithmetic{
	int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic{
	public int divisorSum(int n)
	{
		int r=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				r+=i;
		}
		return r;
	}


}

class InterfaceEx 

{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(" Enter a number");
		int n = scan.nextInt();
		scan.close();

		AdvancedArithmetic myCalculator = new Calculator(); 

		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
		System.out.println("The sum of divisors of "+n+"is\n"+sum);
	}
}

