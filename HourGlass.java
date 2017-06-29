import java.util.Scanner;

public class HourGlass
{
	public static void main(String[] args) 
	{
		Scanner in =new Scanner(System.in);

		int[][] a= new int[6][6];

		for(int i=0;i<6;i++)
			for(int j=0;j<6;j++)
				a[i][j]=in.nextInt();

		in.close();

		int k,l;

		int temp,max=-9*7;

		for(int i=0; i<4 ; i++)
		{
			for (int j=0;j<4 ;j++) 
			{
				k=j;

				temp=a[i][k++]+a[i][k++]+a[i][k--]+a[i+1][k--];

				temp=temp+a[i+2][k++]+a[i+2][k++]+a[i+2][k--];

				if(temp>max)
					max=temp;
			}
		}
		System.out.println(max);
	}
}