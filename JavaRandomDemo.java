//java program to demonstrate Random class
import java.util.Random;
public class JavaRandomDemo
{
    public static void main(String args[])
    {
      Random r=new Random();
      int x=r.nextInt(50);
      //Generates a random numbers between 0 to 49
      int y=r.nextInt(1000);
       //Generates a random integers between 0 to 999
       double a=r.nextDouble();
       System.out.println("The random integers are "+x+" "+y);
       System.out.println("The random double value generated is"+a);
    }
}
