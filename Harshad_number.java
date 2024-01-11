import java.util.Scanner;

class Harshad_number
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number to check number is harshad or not :");
int a=sc.nextInt(); 
int a1=a;          
int sum=0;
while(a>0)
{
int r=a%10; 
sum=sum+r;  
a=a/10;    
}
if(a1%sum==0)  
{
System.out.println("number is harshad");  
}
else
{
System.out.println("number is not harshad");
}

}
}



