import java.util.Scanner;

public class CircleCity
{
	public static void main(String[] args) 
	{
		Scanner in =new Scanner(System.in);
		int t,d,k,count,i,x;
		double y;
		t= in.nextInt();
		if(t>=1 && t<=1000)
		{
			boolean[] ans = new boolean[t];
			for( i= 0;i<t;i++)
			{
				
				count =0;

				d= in.nextInt();
				k=in.nextInt();

				if(d>=1&&d<=2000000000&&k>=0&&k<=2000000000)
				{

				   for(x=1;x<=Math.sqrt(d);x++)
				   {
                      y=Math.sqrt(d-x*x);

                      if(y==(int)y)
                      	count =count+4;

				   }
				   
				   if(k>=count)
				   	ans[i]=true;
				   else
				   	ans[i]=false;

				
				}
			}
			for(i=0;i<t;i++)
			{
				if(ans[i]==true)
					System.out.println("possible");
				else if(ans[i]==false)
					System.out.println("impossible");


			}


		}

		
	}
}