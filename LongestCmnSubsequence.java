import java.util.Scanner;
public class LongestCmnSubsequence
{
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String s1 = scan.next();
		String s2= scan.next();


		int[][] t = new int[s1.length()+1][s2.length()+1];
		for(int i=1 ; i<=s1.length();i++)
		{
			//i first row characters
			for(int j=1;j<=s2.length() ;j++)
			{
				//j is second row characters 
				if(s1.charAt(i-1)==s2.charAt(j-1))
				{
					t[i][j]=t[i-1][j-1]+1;
				}
				else {
					t[i][j] = max(t[i-1][j],t[i][j-1]);
				}
			}
		}

		for(int i=0;i<=s1.length();i++)
		{
			for(int j=0;j<=s2.length();j++)
			{
				System.out.print(t[i][j]+"   ");
			}
			System.out.println();
		}
		int n=s1.length();
		int m= s2.length();
		while (n>0&&m>0) 
		{
			if(t[n][m]==t[n-1][m-1]+1)
			{
				System.out.println(s1.charAt(n-1));
				n--;
				m--;
			}
			else if(t[n][m]==t[n-1][m]) {
				n--;				
			}
			else {
				m--;
			}
		}

	}
	public static int max(int a,int b)
	{
		if(a>b)
			return a;
		return b;
	}
}