import java.util.Scanner;
public class BIGSALE
{
	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int t=scan.nextInt();
			for(int t1=0;t1<t;t1++)
			{
				int n=scan.nextInt();
				double loss=0;
				for(int i=0;i<n;i++)
				{
					int p=scan.nextInt();
					int q=scan.nextInt();
					int x=scan.nextInt();

					double y=p+(p*x)/100.0;
					double sp=y-y*x/100.0
					double l=(double)p-sp;
					l=l*q;
					loss=loss+l;
				}

				System.out.println(loss);


			}
		}	
		
}