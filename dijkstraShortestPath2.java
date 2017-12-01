import java.util.Scanner;

public class dijkstraShortestPath2
{
	public static void main(String[] args) 
	{
		Scanner in= new Scanner(System.in);
		int t= in.nextInt();
		for(int t1=0;t1<t;t1++)
		{
			int n,m,s,x,y,r;
			//System.out.println("Enter no of node and edges");
			n=in.nextInt();
			m=in.nextInt();
			int[][] a=new int[n][n];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(i==j)
						a[i][j]=0;
					else a[i][j]=1000000;
				}
			}
			//System.out.println("Enter edges as (node1 node2 distance)");
			for(int i=0;i<m;i++)
			{
				x=in.nextInt();
				y=in.nextInt();
				r=in.nextInt();
				a[x-1][y-1]=r;
				a[y-1][x-1]=r;
			}
			s=in.nextInt();
			shortestPath(a,s-1,n);


			
		}
	}

	private static void shortestPath(int a[][],int s,int n)
	{
		int i,mdn,x,temp;
		int[] di=new int[n];
		int[] fn=new int[n];
		int[] t=new int[n];
		for(i=0;i<n;i++)
		{
			di[i]=1000000;
			fn[i]=1000000;
			t[i]=0;
		}
		di[s]=0;
		fn[s]=s;
		mdn=s;
		while(true)
		{
			for(i=0;i<n;i++)
			{
				x=di[mdn]+a[mdn][i];
				if(x<di[i])
				{
					di[i]=x;
					fn[i]=mdn;
					t[i]=0;
				}
			}
			t[mdn]=1;
			temp=mdn;
			i=0;
			while(i<n&&t[i]==1)
				i++;
			mdn=i;
			for(i=mdn+1;i<n;i++)
			{
				if(t[i]==0&&di[i]<di[mdn])
					mdn=i;
			}
			if(mdn==temp||mdn>=n)
				break;
		}
		for(i=0;i<n;i++)
		{
			if(i!=s)
			{
				if(di[i]<1000000)
					System.out.print(di[i]+" ");
				else
					System.out.println("-1 ");
			}
		}


	}
}