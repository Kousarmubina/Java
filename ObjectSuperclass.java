//to demonstrate object super class
//ObjectSuperclass.java
import java.io.*;
import java.util.*;
public class SumOfIntegers extends Object
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two integers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=x+y;
        System.out.println("Sum of" +x+ "and" +y+ "is" +z);
    }
}
