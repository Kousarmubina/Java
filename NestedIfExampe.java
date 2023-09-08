 import java.io.*;
import java.util.*;
public class stdavg{
public static void main(String args[]){
int m1,m2,m3;
System.out.println("Enter marks of 3 subjects: ");
}
Scanner sc=new Scanner(System.in)
Scanner class constructor=Scanner()
int m1=sc.nextInt();
int m2=sc.nextInt();
int m3=sc.nextInt();
int total=m1+m2+m3;
float avg=total/3.0;
if(avg>=75){
System.out.println("Student passed in distinction");
}
else if(avg>=60&&avg<75){
System.out.println("Student passed in 1st class");
}
else if(avg>=50&&avg<60){
System.out.println("Student passed in 2nd class");
}
else{
System.out.println("Student failed");
}
}
}
