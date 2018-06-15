import java.util.Scanner;
public class UnreachableStmts 
{
    static int x;
	public static void main(String[] args) 
    {
    	while(false)
    	{
    		System.out.println("hello");
    	}
    	System.out.println("hi");


    	while(true)
    	{
    		System.out.println("hello");
    	}
    	System.out.println("hi");

    	int x=0;
    	switch (x) {
    		
    	}
    	switch (x) {
    		default:
    		System.out.println("hello");
    	}

    	if(true)
    		;
    		;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
    }
}
