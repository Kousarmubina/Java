//Java program to print the speeds of qualifying bikers in a Race
class Race
  {
    public static void main(String args[])
    {
      double a,b,c,d,e,avg;
      a=Double.parseDouble(args[0]);
      b=Double.parseDouble(args[1]);
      c=Double.parseDouble(args[2]);
      d=Double.parseDouble(args[3]);
      e=Double.parseDouble(args[4]);
      avg=(a+b+c+d+e)/5;
      System.out.print("The speed of the racers>=average speed"+avg+": ");
      if(a>avg)
        System.out.print(","+a);
      if(b>avg)
        System.out.print(","+b);
      if(c>avg)
        System.out.print(","+c);
      if(d>avg)
        System.out.print(","+d);
      if(e>avg)
        System.out.print(","+e);
      else
        System.out.print("");
    }
  }
        
      
