//java program to demonstrate finally block
import java.io.*;
public class ExceptionFinallyDemo
{
    public static void main(String args[])
    {
    try
    {
        int x=5/0;
        System.out.println("x= "+x);//the exception occurs statement will not be executed
    }
    catch(ArithmeticException ae)
    {
        System.out.println("Arithmetic exception caught");
    }
    finally
    {
        System.out.println("this finally block will always executed");
    }
    }
}
