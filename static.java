public class Solution{

static Scanner in =new Scanner(System.in);
static int B= in.nextInt();
static int H= in.nextInt();
static boolean flag =false;
static
{
    if (B<=0||H<=0)
       { flag = false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
       }
     else
         flag = true;
 
}
public static void main(String[] args){
if (flag)
{
int area= B*H;
System.out,println(area);

}





}