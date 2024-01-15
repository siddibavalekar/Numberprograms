import java.util.Scanner;

class Buzz_num
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter any number to check the number is buzz number or not :");
int a=sc.nextInt();
if(a%7==0 || a%10==7)
{
System.out.println("number is buzz");
}
else
{
System.out.println("number is not buzz");
}

}
}

