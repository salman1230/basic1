import java.util.*;
class Fibonacci
{
public static void main(String arg[])
{
int n,a=0,b=0,c=1;
Scanner f=new Scanner(System.in);
System.out.println("enter the value of n");
n=f.nextInt();
System.out.println("fibonacci series are:");
for(int i=1;i<=n;i++)
{
a=b;
b=c;
c=a+b;
System.out.println(a+"");
}
}
} 