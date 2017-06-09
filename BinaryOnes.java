import java.util.Scanner;

public class BinaryOnes
{
	public static void main(String[] args) 
	{
		Scanner in =new Scanner(System.in);
		int n,b=0;
		n=in.nextInt();

		while(n!=0)
		{
			b=b*10+n%2;
			n=n/2;
		}
		while(b!=0)
		{
			n=n*10+b%10;
			b=b/10;
		}
		
		System.out.println(n);
	}
}