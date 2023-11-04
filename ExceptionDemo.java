//java program to demonstrate try catch block 
import java.io.*;
public class ExceptionDemo
{
    public static void main(String args[])
    {
        try
        {
            int x=5/0;
            System.out.println("x= "+x);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("aritmetic exception caught "+ae.getMessage());
        }
    }
}
