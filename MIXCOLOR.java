import java.util.Scanner;
public class MIXCOLOR
{
	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int t=scan.nextInt();
			for(int t1=0;t1<t;t1++)
			{
				
				int n=scan.nextInt();
				int []a=new int[n];
				for(int i=0;i<n;i++)
					a[i]=scan.nextInt();

				 sort(a, 0, n);

				 int count=0,temp;
				 temp=a[0];
				 for(int i=1;i<n;i++)
				 {
				 	if(temp==a[i])
				 		count++;
				 	temp=a[i];
				 }
				 System.out.println(count);


			}
		}	

		/* Merge Sort function */
    public static void sort(int[] a, int low, int high) 
    {
        int N = high - low;         
        if (N <= 1) 
            return; 
        int mid = low + N/2; 
        // recursively sort 
        sort(a, low, mid); 
        sort(a, mid, high); 
        // merge two sorted subarrays
        int[] temp = new int[N];
        int i = low, j = mid;
        for (int k = 0; k < N; k++) 
        {
            if (i == mid)  
                temp[k] = a[j++];
            else if (j == high) 
                temp[k] = a[i++];
            else if (a[j]<a[i]) 
                temp[k] = a[j++];
            else 
                temp[k] = a[i++];
        }    
        for (int k = 0; k < N; k++) 
            a[low + k] = temp[k];         
    }
		
}