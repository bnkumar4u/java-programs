import java.util.Scanner;
public class snuffels
{
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);

		int T=in.nextInt();
		for(int t=0;t<T;t++)
		{
			int n=in.nextInt();
			int d=in.nextInt();

			int a[]=new int[n];

			int sum=0;

			for(int i=0;i<n;i++)
			{
				a[i]=in.nextInt();
				sum=sum+a[i];
			}
			if(sum%n!=0)
			{
				System.out.println("-1");
			}
			else
			{
				int moves=0;
				int avg=sum/n;
				for(int i=0;i<n;i++)
				{
					if(a[i]<avg)
					{
						moves=moves+avg-a[i];
					}

				}
				System.out.println(moves);
			}



		}

	}
	
}