import java.util.Scanner;
public class Knapsack01
{
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n,maxWeight;//n=no of items
		n= scan.nextInt();
		maxWeight= scan.nextInt();
		int[] wt = new int[n];
		int[] values = new int[n];

		for(int i=0;i<n;i++)
			wt[i]=scan.nextInt();
		for(int i=0;i<n;i++)
			values[i]=scan.nextInt();


		int[][] t = new int[n][maxWeight+1];
		for(int i=0 ; i<n;i++)
		{
			//i is no of items
			for(int j=0;j<=maxWeight ;j++)
			{
				//j is total weight + 1 
				if(j<wt[i])
				{
					try{
					t[i][j]=t[i-1][j];
					}catch (ArrayIndexOutOfBoundsException e) {
						t[i][j]=0;
					}
				}
				else
				{
					try{
					t[i][j] = max(values[i]+t[i-1][j-wt[i]] , t[i-1][j]);
					}catch (ArrayIndexOutOfBoundsException e) {
						t[i][j]=values[i];
					}

				}
			}
		}

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=maxWeight;j++)
			{
				System.out.print(t[i][j]+"   ");
			}
			System.out.println();
		}

	}
	public static int max(int a,int b)
	{
		if(a>b)
			return a;
		return b;
	}
}