import java.util.Scanner;

public class BeautifulArrays
{
	public static void main(String[] args)
    {
    	int t;
    	Scanner scan =new Scanner(System.in);
    	t=scan.nextInt();
    	if(t>=1&&t<=1000000)
    	{
    		boolean[] ans =new boolean[t];
    		for (int i=0;i<t ;i++ ) 
    		{  int n;
    			ans[i]= true;
    			n=scan.nextInt();
    			if(n>=1&&n<=1000000)
    			{
    				int a[] = new int[n];
    				for (int j=0;j<n ;j++ ) 
    				{
    					a[j]=scan.nextInt();	
    				}
    				for(int j=0;j<n-1;j++)
    				{
    					if(a[j]>=-1000000000&&a[j]<=1000000000)
    					{
    						
    					for (int k=j+1;k<n ;k++ ) 
    					{
    						int temp=a[j]*a[k];
    						

    						int check=0;
    						for(int l=0;l<n;l++)
    						{
    							if (temp==a[l]) 
    							{
    								check=1;
    								break;
    							}
    						}
    						if(check==0)
    						{
    							ans[i]=false;
    							break;
    						}
    						
    					}
    					if(ans[i]==false)
    						{break;}
    					}
    				}

    			}
    			
    		}
    		for(int m=0;m<t;m++)
    		{
    			if(ans[m]==true)
    				System.out.println("yes");

    			else if(ans[m]==false)
    				System.out.println("no");
    		}
    	}
		
	}
}