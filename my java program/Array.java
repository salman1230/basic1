import java.util.*;
class Array 
{
public static void main(String arg[])
{
int arr[],var1;
arr=new int[5];
System.out.println("enter the array elements");
Scanner a=new Scanner(System.in);
for(var1=0;var1<5;var1++)
{
System.out.println("Array:");
arr[var1]=a.nextInt();
}
System.out.println("Array elements are:");
for(var1=0;var1<5;var1++)
{
System.out.println(arr[var1]+"\t");
}
}
}