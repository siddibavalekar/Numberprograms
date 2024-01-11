import java.io.*;
import java.util.*;

public class Ugly_number
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number to check number is ugly or not :");
int a=sc.nextInt();

if(a%2==0 ||a%3==0 ||a%5==0)
{
  System.out.println(a+": is an Ugly Number");      
}
else
{
System.out.println(a+": is not an Ugly Number");
}

}
}