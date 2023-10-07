//@Override example in java annotations
class Animal
{
    void eat()
    {
        System.out.println("Animal can eat");
    }
}
class Dog extends Animal
{
    @Override
    void eat()
    {
        System.out.println("Dog can eat");
    }
}
class AnnotationDemo1
{
    public static void main(String args[])
    {
        Animal a=new Dog();
        a.eat();
    }
}
