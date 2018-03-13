import java.util.Scanner;
public class HILLS 
{
	public static void main(String[] args) 
	{
			int t;
			Scanner in=new Scanner(System.in);
			t=in.nextInt();
			for(int t1=0;t1<t;t1++)
			{
				int n,u,d;
				n=in.nextInt();
				u=in.nextInt();
				d=in.nextInt();
				boolean parasuite=true;
				int currentH;
				int [] h=new int[n];
				for(int i=0;i<n;i++)
					h[i]=in.nextInt();
				currentH=h[0];
				int i;
				for( i=1;i<n;i++)
				{
					if(h[i]>currentH)
					{
						if(h[i]-currentH>u)
							break;
					}
					else if(h[i]<currentH)
					{
						if(currentH-h[i]>d)
						{
							if(!parasuite)
								break;
							parasuite=false;
						}
						

					}
					currentH=h[i];

				}
				System.out.println(i);
			}
		}	
}