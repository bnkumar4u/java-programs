import java.util.Scanner;
public class MAGICHF
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0)
		{
			int s1,s2;
			int n=scan.nextInt(),x=scan.nextInt(),s=scan.nextInt();
			for(int i=0;i<s;i++)
			{
				s1=scan.nextInt();
				s2=scan.nextInt();
				if(x==s1)
					x=s2;
				else if(x==s2)
					x=s1;
			}
			System.out.println(x);			
		}
	}
}