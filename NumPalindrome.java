//to demonstrate the given number is palindrome or not.
//NumPalindrome.java
import java.io.*;
import java.util.*;
public class NumPalindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter integer value in between 1 to 20");
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        while(n>0)
        {
            int rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        System.out.println("After reversing the number is:"+rev);
        if(rev==temp)
        {
            System.out.println(temp+"is a palindrome");
        }
        else
        {
            System.out.println(temp+"is not a palindrome");
        }
    }
}
