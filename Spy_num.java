import java.util.Scanner;
class Spy_num
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number to check the number is Spy number or not:");
int a=sc.nextInt();

int sum=0;
int product=1;

while(a>0)
{
int rem=a%10;
sum=sum+rem;
product=product*rem;
a=a/10;
}
if(sum==product)
{
System.out.println("number is spy");
}
else
{
System.out.println("number is not spy");
}
}
}
