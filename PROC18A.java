import java.util.Scanner;
public class PROC18A
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t=scan.nextInt();

		for(int t_=0;t_<t;t_++)
		{
			int n=scan.nextInt();
			int k=scan.nextInt();
			int[] a= new int[n];
			for(int i=0;i<n;i++)
				a[i]=scan.nextInt();

			int maxImpressions=0;
			for(int i=0;i<=n-k;i++)
			{
				int temp=0;
				for(int j=i;j<i+k; j++)
				{
					temp=temp+a[j];
				}
				if(temp>maxImpressions)
					maxImpressions=temp;
			}
			System.out.println(maxImpressions);

		}

	}
}