//java program to demonstrate Wrapper classes (Autoboxing)
//to demonstrate conversion of primitive to object
import java.io.*;
import java.lang.*;
public class AutoBoxDemo
{
    public static void main(String args[])
    {
        int a=20;
        Integer i=Integer.valueOf(a);
        Integer j=a;
        System.out.println("a="+a);
        System.out.println("i="+i);
        System.out.println("j="+j);
    }
}
