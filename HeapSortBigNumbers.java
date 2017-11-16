import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
*any no of digits like 1 to 10^6 digits can be sorted
**/

public class HeapSortBigNumbers {
    private static boolean greater(String a, String b)
    {
        if(a.length()>b.length())
            return true;
        else if(a.length()<b.length())
            return false;
        else
        {
            char[] a1=a.toCharArray();
            char[] b1=b.toCharArray();
            for(int i=0;i<a1.length;i++)
            {
                if(a1[i]==b1[i])
                    continue;
                else if(a1[i]>b1[i])
                    return true;
                else return false;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] a = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            a[unsorted_i] = in.next();
        }
        a=mergesort(a,0,n-1);
        
        for(int i=0;i<n;i++)
            System.out.println(a[i]);
        
        // your code goes here
    }
 static String[] mergesort(String a[],int s,int e)
{
	if(s<e)
	{
		int m;
		m=(s+e)/2;

		a=mergesort(a,s,m);
		a=mergesort(a,m+1,e);
		a=merge(a,s,m,e);
	}
     return a;
}
static String[] merge(String a[],int s,int m, int e)
{
	int i,j,k,n1,n2;
	n1=m-s+1;
	n2=e-m;
    String[] l=new String[n1];
    String[] r=new String[n2];
    
	for(i=0;i<n1;i++)
		l[i]=a[s+i];
	for(j=0;j<n2;j++)
		r[j]=a[m+1+j];
	i=0;
	j=0;
	k=s;
	while(i<n1&&j<n2)
	{
		if(!greater(l[i],r[j]))
		{
			a[k]=l[i];
			i=i+1;
			k=k+1;
		}
		else
		{
			a[k]=r[j];
			j=j+1;
			k=k+1;
		}
	}
	while(i<n1)
	{
		a[k]=l[i];
		i++;
		k++;
	}
	while(j<n2)
	{
		a[k]=r[j];
		j++;
		k++;
	}
    return a;
}
}
