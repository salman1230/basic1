import java.util.*;
class Palindrome
{
public static void main(String args[])
{
String a,b;
StringBuffer sb;
Scanner obj=new Scanner(System.in);
System.out.println("enter the string");
a=obj.nextLine();
sb=new StringBuffer(a);
b=sb.reverse().toString();
System.out.println(a);
System.out.println(b);
if(a.equals(b))
{
System.out.println("entered string is an palindrome");
}
else
{
System.out.println("entered string is not an palindrome");
}
}
}