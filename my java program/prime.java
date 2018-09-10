import java.util.*;  
public class Prime
{ 
public static void main(String[] args) 
{
int i;
int j=2;
int ch=0;
Scanner s=new Scanner(System.in);
System.out.println(" enter a number");
i=s.nextInt();
while(j<=i/2)
{
if(i%j==0)
{
System.out.println("Not Prime"+i);
ch=1;
break;
}
else
{
j++;
}
}
if(ch==0)
{
System.out.println("prime"+i);
}
}
} 
 