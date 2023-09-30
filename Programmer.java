//30-09-2023
//Programmer.java
import java.io.*;
class Employee
{
    float salary=40000;
}
class Programmer extends Employee
{
    int bonus=10000;
    public static void main(String args[])
    {
        Programmer p=new Programmer();
        System.out.println("Salary of the programmer is"+p.salary);
        System.out.println("Bonus of programmer salary is"+p.bonus);
        float grossSalary=p.salary+p.bonus;
        System.out.println("gross salary of the programmer is"+grossSalary);
    }
}
