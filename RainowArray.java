import java.util.Scanner;
public class RainowArray
{
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);

		int T=in.nextInt();
		for(int t=0;t<T;t++)
		{
			boolean ans=false;
			int n=in.nextInt();

			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=in.nextInt();

			int ai=1;

			if(a[0]==1&&a[n-1]==1)
			{
				for(int i=1;i<=n/2;i++)
				{
					if(a[i]==a[n-i-1])
					{
						if(a[i]!=ai)
						{
							if(a[i]==ai+1)
							{
								if(a[i-1]==ai)
								{
									ai++;
									ans=true;
								}
							}
							else
							{
								ans=false;
								break;
							}
						}

					}
					else
						{ans=false;}

				}

			}
			else 
				{ans=false;}

			if(ans)
				System.out.println("yes");
			else
				System.out.println("no");


			
		}

	}
	
}