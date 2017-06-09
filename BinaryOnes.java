/**
*   program to find Max no. of consecutive 1's in binary number of a number
**/

import java.util.Scanner;

public class BinaryOnes
{
	public static void main(String[] args) 
	{
		Scanner in =new Scanner(System.in);
		int n,count=0;
		/**
		* inputing a number
		**/
		n=in.nextInt();
		while(n){

			//bit wise operation. << leftward swift.
			// & bitwise and operator
			 n = (n & (n << 1));

			 // counts Max no. of consecutive 1's in binary number of n.
		count++;
		}

		System.out.println(count);
	}
}