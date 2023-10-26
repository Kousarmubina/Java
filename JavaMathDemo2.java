//java program to demonstrate Math class
import java.io.*;
import java.lang.*;
public class JavaMathDemo
{
    public static void main(String args[])
    {
        double x=28;
        double y=4;
        System.out.println("maximum of x and y is"+Math.max(x,y));
        System.out.println("minimum of x and y is"+Math.min(x,y));
          System.out.println("sqrt of y is"+Math.sqrt(y));
        System.out.println("pow of x to y is"+Math.pow(x,y));
        System.out.println("logarithm of x is"+Math.log(x));
        System.out.println("log10 of x is"+Math.log10(x));
        double z=Math.toRadians(x);
        System.out.println("Z value is"+z);
        double d=30;
        System.out.println("Tangent value of d is"+Math.tan(d));
    }
}
