import java.util.*;

class OddEven
{
public static void main(String arg[])
{
int n;
Scanner obj=new Scanner(System.in);
System.out.println("enter the number");
n=obj.nextInt();
if(n%2==0)
System.out.println("number is even\n"+n);
else
System.out.println("number is odd\n"+n);
}
}
