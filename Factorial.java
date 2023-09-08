//to find factorial of a given number
//Factorial.java
import java.io.*;
import java.util.*;
public class Factorial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter integer value in between 1 to 20");
        int n=sc.nextInt();
        int fact=1;
        for(int i=2;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of"+n+"natural number is"+fact);
    }
}
