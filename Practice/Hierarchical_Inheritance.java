class animal{
    void eat()
    {
        System.out.println("eating.........");
    }
}
class Dog extends animal{
    void bark()
    {
        System.out.println("barking........");
    }
}
class Cat extends animal{
    void meow()
    {
        System.out.println("meowing........");
    }
}
public class Hierarchical_Inheritance{
    public static void main(String[]args){
        Cat c = new Cat();
        c.meow();
        c.eat();
        // c.bark();
    }
}
                                                                                           