/**
*Chef has a calculator which has two screens and two buttons. Initially, each screen shows the number zero. Pressing the first button increments the number on the first screen by 1, and each click of the first button consumes 1 unit of energy.
*Pressing the second button increases the number on the second screen by the number which is currently appearing on the first screen. Each click of the second button consumes B units of energy.
*Initially the calculator has N units of energy.
*Now chef wonders what the maximum possible number is, that he gets on the second screen of the calculator, with the limited energy.
*Input
*The first line of the input contains an integer T denoting the number of test cases.
*Each test case is described using a single line containing two integers, N and B.
*Output
*For each test case, output a single line containing the answer to this test case.
**/


import java.util.Scanner;

public class TwoButtons
{
	public static void main(String[] args) 
	{
		Scanner in =new Scanner(System.in);

		int T = in.nextInt();

		int []ans = new int[T];

		for(int i=0;i<T;i++)
		{
			int n=in.nextInt();

			int b=in.nextInt();
			int x=0,y=0,x1=0,y1=0;

			if(b==1)
			{
				x=n/2;
				y=x*(n-n/2);
			}

			else if(b==n)
			{
				y=0;
				y1=0;
			}

			else
			{
				x1=x=n/b;



				while((n-x)%b!=0)
				{
					x++;
				}
				y=x*((n-x)/b);

				while((n-x1)%b!=0)
				{
					x1--;
				}
				y1=x1*((n-x1)/b);
			}
			if(y1>y)
				ans[i]=y1;
			else
				ans[i]=y;
		}

		for(int i:ans)
			System.out.println(i);
	}
}