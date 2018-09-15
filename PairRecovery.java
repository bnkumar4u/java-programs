import java.util.*;
public class PairRecovery
{
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n= scan.nextInt(),
			x=scan.nextInt(),
			y=scan.nextInt();
		int[] a=new int[n];

		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		int[] temp=a.clone();
		Arrays.sort(a);
		int value=0,v1=0,v2=0;
		for(int i=0;i<n;i++)
		{
			v1=decrease(temp,y);
			if(v1<y)
			{
				a=temp;
				value=value+v1;
			}
		else 
			{
				value =value +x;
				
			}	
		}

	}
}