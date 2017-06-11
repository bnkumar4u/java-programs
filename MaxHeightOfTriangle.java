/**
 *   program to find maximum height of a triangle with area 'a' and base 'b'.
 */

import java.util.Scanner;

public class MaxHeightOfTriangle
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b=in.nextInt();
        int a=in.nextInt();
        int h;
        h= (int) Math.ceil(2.0*a/b);

        System.out.println(h);
    }
}