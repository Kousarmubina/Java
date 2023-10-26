//java program to demonstrate autoboxing
import java.io.*;
import java.lang.*;
public class BoxingDemo
{
    public static void main(String args[])
    {
        int a=50;
        Integer i=new Integer(a);
        Integer j=a;
        Integer x=new Integer(60);
        int y=x.intValue();
        int z=x;
        System.out.println("a=" +a+"i="+i+"j="+j+"x="+x+"y="+y+"z="+z);
    }
}
