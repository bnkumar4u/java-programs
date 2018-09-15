import java.util.*;
public class XORIER
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0)
		{
			int n=scan.nextInt();
			int[] a= new int[n];
			int count=0, odds=-1,evens =-1;
			int[] freq = new int[1000001];
			for(int i=0;i<n;i++)
			{
				a[i]=scan.nextInt();
				
			}
			for (int i=0 ;i<n ;i++ ) {
				freq[a[i]-1]=freq[a[i]-1]+1;

				if(a[i]%2==0)
					evens++;
				else 
					odds++;
			}
			
			count=(odds*(odds+1))/2;
		
			count=count+(evens*(evens+1))/2;
			for(int i=0;i<n;i++)
			{
					freq[a[i]-1]=freq[a[i]-1]-1;
					count = count- freq[a[i]-1];
				

				if((a[i]^(a[i] +2))==2)
						count = count-freq[a[i]+1];
				if((a[i]^(a[i]-2))==2){
					try{
						count=count- freq[a[i]-3];
					}catch(Exception e){}
					}
			}
			System.out.println(count);
			System.gc();
			
		}
	}
	
}