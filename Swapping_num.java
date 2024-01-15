class Swapping_num
{
public static void main(String args[])
{
swapwithout_third_variable(11,22);
}
public static void swapwithout_third_variable(int s,int t)
{
s=s-t;
t=t+s;
s=t-s;

System.out.println("s value is:"+s);
System.out.println("t value is:"+t);

}

}