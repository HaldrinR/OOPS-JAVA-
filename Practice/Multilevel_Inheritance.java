class Animal
{
    void eat()
    {
        System.out.println("eating.....");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("barking.....");
    }
    private void jump()
    {
        System.out.println("jumping......");
    }
}
class Babydog extends Dog
{
    void weep()
    {
        System.out.println("weeping");
    }
}
public class Multilevel_Inheritance{
    public static void main (String[]args){
        Babydog b = new Babydog();
        b.weep();
        b.bark();
        b.eat();
    }
}