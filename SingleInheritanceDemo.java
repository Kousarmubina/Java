//SingleInheritanceDemo.java
import java.io.*;
class Animal
{
    void eat()
    {
        System.out.println("Animal can eat");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog can bark");
    }
}
class SingleIngeritanceDemo
{
    public static void main(String args[])
    {
        Dog d=new Dog();
        d.eat();
        d.bark();
    }
}
