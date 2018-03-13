import java.util.Scanner;
public class CHEGLOVE
{
	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int t=scan.nextInt();
			for(int t1=0;t1<t;t1++)
			{
				int n=scan.nextInt();
				int[] l=new int[n];
				int[] g= new int[n];
				for(int i=0;i<n;i++)
					l[i]=scan.nextInt();

				for(int i=0;i<n;i++)
					g[i]=scan.nextInt();

				boolean front=isFront(l,g);
				boolean back=isBack(l,g);
				if(front&&back)
					System.out.println("both");
				else if(front)
					System.out.println("front");
				else if(back)
					System.out.println("back");
				else
					System.out.println("none");


			}
		}	
		static boolean isFront(int[] l,int[] g)
		{
			for(int i=0;i<l.length;i++)
			{
				if(l[i]>g[i])
					return false;
			}
			return true;
		}
		static boolean isBack(int[] l,int[] g)
		{
			for(int i=0;i<l.length;i++)
			{
				if(l[i]>g[n-i-1])
					return false;
			}
			return true;
		}
}