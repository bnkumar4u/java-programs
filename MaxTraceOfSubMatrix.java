import java.util.Scanner;
public class MaxTraceOfSubMatrix 
{
    static int n;
	public static void main(String[] args) 
    {
        Scanner scan= new Scanner(System.in);
        int t=scan.nextInt();
        for(int t_ =0; t_<t ; t_++)
        {
            int trace=0,temp;
            n=scan.nextInt();
            int[][] a=new int[n][n];

            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n ; j++)
                {
                    a[i][j]=scan.nextInt();
                    if(i==j)
                        trace=trace+a[i][i];
                }
            }

            for(int i=0;i<n-1;i++)
            {
                temp=maxTrace(a,i);
                if(temp>trace)
                    trace=temp;
            }
            System.out.println(trace);


        }   
    }
    public static int maxTrace(int[][] a,int k)
    {
        int trace =Integer.MIN_VALUE,temp;
        for(int i=0 ; i<n-k ;i++)
        {
            for(int j=0;j<n-k ;j++)
            {
                temp=0;
                //we are at submatrix (i,j)as 1st element
                for(int l=0 ;l<=k ;l++)
                {
                    temp=temp+a[i+l][j+l];
                }
                if(temp>trace)
                    trace=temp;

            }
        }
        return trace;
    }
}