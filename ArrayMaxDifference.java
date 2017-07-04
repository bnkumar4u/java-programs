import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference 
{
	private int[] elements;
	public int maximumDifference;
	Difference(int[] a)
	{
		elements = a;
	}
	void computeDifference()
	{
		int min,max;
		min=max=elements[0];
		for(int i=0;i<elements.length;i++)
		{
			if(elements[i]<min)
				min =elements[i];
			if(elements[i]>max)
				max =elements[i];

		}
		maximumDifference=max-min;
	}
}
public class ArrayMaxDifference 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) 
		{
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}