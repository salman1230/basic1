import java.util.*;
class Armstrong
{
public static void main(String args[])
{
int n,sum=0,temp,remainder,digits=0;
Scanner obj=new Scanner(System.in);
System.out.println("enter the number");
n=obj.nextInt();
temp=n;
while(temp!=0)
{
digits++;
temp=temp/10;
}
temp=n;
while(temp!=0)
{
remainder=temp%10;
sum=sum+power(remainder,digits);
temp=temp/10;
}
if(n==sum)
System.out.println(n+"\n is  an armstrong number\n");
else
System.out.println(n+"\n is not an armstrong number");
}
static int power(int n,int r)
{
int c,p=1;
for(c=1;c<=r;c++)
p=p*n;
return p;
}

}

