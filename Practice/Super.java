class Vehicle{
    int maxSpeed=180;
    void message()
    {
        System.out.println("Parent Class");
    }
}
    class Car extends Vehicle{
        int maxSpeed=120;
        void message()
        {
            System.out.println("Child Class");
        }
        void display()
        {
            System.out.println("Max of car: "+maxSpeed);
            System.out.println("Max of vehicle: "+super.maxSpeed);
            message();
            super.message();
        }
    }

public class Super{
    public static void main(String[]args){
        Car small = new Car();
        small.display();
    }
}