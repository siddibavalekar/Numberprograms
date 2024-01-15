import java.util.Scanner;
class Reverse_number
{
static Scanner sc=new Scanner(System.in);
public static void main(String ags[])
{
Reverse_number rn=new Reverse_number();
Reverse_number.reversee();
}

public static void reversee()
{
System.out.println("Enter a number");
int a=sc.nextInt();
int reverse=0;
	while(a>0)
	{
	int rem=a%10;
	reverse=reverse*10+rem;
	a=a/10;

	}
System.out.println("Reverse the given number:"+reverse);


	while(reverse>0)
	{
	int rem1=reverse%10;
	
	reverse=reverse/10;

	}
}
}