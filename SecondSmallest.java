public class SecondSmallest
{
	public static void main(String[] args) 
	{ int min1,min2;
		min1=min2=100000;
		int ar1[] = {1,1,3,4,1};
		 for (int i=0;i<5;i++ ) 
        {
            if(ar1[i]<min1 )
            {
                min2=min1;
                min1=ar1[i];
                //pos1=i;
            }
            else if(ar1[i]<min2)
                min2=ar1[i];
        }
		System.out.println(min2);
	}
}