import java.util.Scanner;

class Pronic_num
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int sum=0;
int flag=0;

for(int i=1,j=i+1;j<=a;j++,i++)
{
if(i*j==a)
{
System.out.println(i+ " * "+j+" = "+a);
flag ++;
}
}
if(flag!=0)
{
System.out.println("number is promic");
}
else
{
System.out.println("number is not pronic");
}

}
}



























