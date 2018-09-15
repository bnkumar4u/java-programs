import java.util.*;
public class BSHUFFLE
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1 ; i<=n;i++)
			System.out.print(i+" ");
		System.out.println();
		for(int i=n ; i>=1;i--)
			System.out.print(i+" ");
		System.out.println();
			
	}
	
}