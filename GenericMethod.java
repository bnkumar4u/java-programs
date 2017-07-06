/**
*   JAVA PROGRAM TO PRINT ARRAY OF ANYTYPE USING GENERICS METHODS
**/

import java.util.*;

class Printer  
{
	void printArray(GenericType<T> a[] )
	{
		for(T i : a)
			System.out.print(i+"\t");

		System.out.println();
	}
}


public class GenericMethod
{

	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter no of elements in integer array ");

		int n = scanner.nextInt();

		System.out.println("Enter the elements");

		Integer[] intArray = new Integer[n];

		for (int i = 0; i < n; i++) 
		{
			intArray[i] = scanner.nextInt();
		}

		System.out.println("Enter no of elements in a String Arrray");

		n = scanner.nextInt();

		String[] stringArray = new String[n];

		System.out.println("Enter the Strings");

		for (int i = 0; i < n; i++)
		{
			stringArray[i] = scanner.next();
		}

		System.out.println("The Entered values are ");

		Printer intPrinter = new Printer();

		Printer stringPrinter = new Printer();
		

		intPrinter.printArray( intArray  );

		stringPrinter.printArray( stringArray );

		if(Printer.class.getDeclaredMethods().length > 1)
		{
			System.out.println("The Printer class should only have 1 method named printArray.");
		}
	} 
}