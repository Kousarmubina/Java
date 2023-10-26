//java program to demonstrate Enum's
import java.io.*;
import java.lang.*;
public class EnumDemo
{
    public enum Season{SUMMER,WINTER,SPRING,FALL}
    public static void main(String args[])
    {
        for(Season s:Season.values())
        {
                  System.out.println(s);
        }
    }
}

