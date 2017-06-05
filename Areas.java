import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
       System.out.println("choose the option\n1.Area of triangle\n2.Area of square\n3.Area of circle");
       Scanner s=new Scanner(System.in);
       int c;
       c=s.nextInt();
       switch (c){
           case 1:
           triangle();
            break;
           case 2:
           square();
            break;
           case 3:
           circle();
           break;
           default:
               System.out.println("choose the option\n1.Area of triangle\n2.Area of square\n3.Area of circle");
       }
    }

    static void triangle() {
        System.out.println("Enter side lengths of a triangle ABC");
        float s, A,a, b, c;
        Scanner t = new Scanner(System.in);
        a = t.nextFloat();
        b = t.nextFloat();
        c = t.nextFloat();
        s = (a + b + c)/2;
        A = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The area is = " + A);
    }
   static void square(){
        int a,A;
        System.out.println("Enter side of square");
       Scanner s = new Scanner(System.in);
        a=s.nextInt();
        A=a*a;
        System.out.println("Area of the square is "+A);
   }
   static void circle(){
       int r;
       float a;
       System.out.println("Enter the radius of circle");
       Scanner s = new Scanner(System.in);
       r=s.nextInt();
       a= (float) (3.14*r*r);
       System.out.println("The area of cirlce is "+a);
   }
}