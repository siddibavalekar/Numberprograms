import java.util.Scanner;
class Palindrome_number
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter any number to check number is palindrom or not :");
int a=sc.nextInt();
int a1=a;
int rem=0;
int reverse=0;

while(a1>0)
{
rem=a1%10;
reverse=reverse*10+rem;
a1=a1/10;
}

if(reverse==a)
{
System.out.println(a+": number is palindrome");
}
else
{
System.out.println(a+": number is not palindrome");
}

}
}