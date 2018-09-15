import java.util.Scanner;
public class CHEFADV
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0)
		{
			int n=scan.nextInt(),
				m=scan.nextInt(),
				x=scan.nextInt(),
				y=scan.nextInt();
			int knowledge=1,power=1;
			int x1=n/x, x2=m/y;
			if(x1>1&&x2>1)
			{
				knowledge=knowledge+x*(x1-1);
				power=power+y*(x2-1);

			}
			
			while(knowledge!=n-1&& knowledge<n)
			{
				knowledge=knowledge+x;
			}
			while(power!=m-1&& power<m)
			{
				power=power+y;
			}
			if(knowledge==n&&power==m)
				System.out.println("Chefirnemo");
			else if(knowledge==n-1&&power==m-1)
				System.out.println("Chefirnemo");
			else{
				if(x==1)
				{
					knowledge=knowledge+1;
				}
				if(y==1)
					power++;
				if(knowledge==n &&power==m)
					System.out.println("Chefirnemo");
				else
					System.out.println("Pofik");
			}
					
					
		}
	}
}