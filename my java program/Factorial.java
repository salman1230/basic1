import java.util.*;
class Factorial 
{
public static void main(String arg[])
{
int n,fact=1;
Scanner obj=new Scanner(System.in);
System.out.println("enter the value for n");
n=obj.nextInt();
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("factorial="+fact);
}
}