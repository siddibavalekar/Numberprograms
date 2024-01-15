//range of prime number

import java.util.Scanner;

class Range_primenum
{
public static void main(String asrg[])
{
for(int i=50;i<=100;i++)
{
int a=i;
int count=0;
	for(int j=2;j<=a-1;j++)
	{

	if(a%j==0)
	{
	count ++;
	break;
	}
	}
if(count==0)
{
System.out.println(a);
}

}
}
}
