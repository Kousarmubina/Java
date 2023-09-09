//to demonstrate roots of quadratic equation
//QuadraticRoots.java
import java.io.*;
class QuadraticRoots
  {
    public static void main(String args[])
    {
      double a,b,c,d,r1,r2,x;
      a=Double.parseDouble(args[0]);
      b=Double.parseDouble(args[1]);
      c=Double.parseDouble(args[2]);
      d=(b*b)-4*a*c;
      x=Math.sqrt(d);
      if(d>0)
      {
        r1=(-b+x)/(2*a);
        r2=(-b-x)/(2*a);
        System.out.println("First root is: "+r1+" Second root is: "+r2);
      }
      else if(d==0)
      {
        System.out.println("Roots are equal and value is: "+(-b/(2*a)));
      }
      else
      {
        System.out.println("Roots are Imaginary");
      }
    }
  }

      
