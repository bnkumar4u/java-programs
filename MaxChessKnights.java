import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T=in.nextInt();
		if(T>=1&&T<=150)
		{
			int[] ans =new int[T];
			for(int i=0;i<T;i++)
			{
				int n=in.nextInt();
				int m=in.nextInt();
				if(n%2==0 && m%2==0&&n>2&&m>2)
				{
					ans[i]=(n*m)/2;

				}
				else
					ans[i]=(n*m + 1)/2;
				
			}
			for(int i=0;i<T;i++)
				System.out.println(ans[i]);
		}
		
}

}