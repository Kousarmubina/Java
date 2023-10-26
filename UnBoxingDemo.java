//java program to demonstrate Wrapper classes(Unboxing)
//conversion of object to primitive
import java.io.*;
import java.lang.*;
public class UnBoxingDemo
{
    public static void main(String args[])
    {
        Integer x=new Integer(30);
        int y=x.intValue();//converting object to primitive explicitly
        int z=x;//Unboxing`
        System.out.println("x=" +x + "y=" +y + "z=" +z);
    }
}
