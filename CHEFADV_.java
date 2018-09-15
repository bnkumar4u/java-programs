import java.util.Scanner;
public class CHEFADV_
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0)
		{
			int s1,s2;
			int n=scan.nextInt(),
				m=scan.nextInt(),
				x=scan.nextInt(),
				y=scan.nextInt();
			n--;
			m--;
			int r1=n%x,r2=m%y;
			if((n==1&&m==1)||(n==0&&m==0))
				System.out.println("Chefirnemo");
			else if(r1==r2)
			{
				if(r1==0||r1==1)
					System.out.println("Chefirnemo");
				else
					System.out.println("Pofik");
			}else
				System.out.println("Pofik");
					
					
		}
	}
}