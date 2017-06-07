import java.io.*;
import java.util.*;
public class check
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("enter the number");
int n=scan.nextInt();
if(n>0)
{
System.out.println("the number is +ve");
}
else if(n==0)
{
System.out.println("the number is 0");
}
else
{
System.out.println("the number is negative");
}
}
}
