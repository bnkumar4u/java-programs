
public class TwoDArray
{
	public static void main(String[] args) 
	{
		int [][] arr;
		arr=new int[4][];

		arr[0]=new int[5];
		arr[1]=new int[10];
		arr[2]=new int[15];
		arr[3]=new int [20];

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].length);
		}
		
	}
}