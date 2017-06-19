import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T=in.nextInt();
		int i,j,k,p,q;
		if(T>=1&&T<=100)
		{
			
			for(i=0;i<T;i++)
			{
				int x=0,y=1;
				int n=in.nextInt();
				if(n>=2&&n<=100)
				{

				  System.out.println(n);
				  for( j=1;j<=n;j++)
				  {
					
					x++;
					y++;
					if(y==n+1)
						y=1;

					System.out.println(n);
					for( k=1,p=x,q=y;k<=n;k++)
					{
						System.out.printf("%d %d %d\n",k,p,q);
						p++;
						q++;
						if(p==n+1)
							p=1;
						if(q==n+1)
							q=1;
					}
				  }

				}

			}
				

		


	}
}}