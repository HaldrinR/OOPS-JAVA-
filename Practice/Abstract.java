abstract class Shape{
    int data1, data2;
    abstract void PrintArea();
}
class Rectangle extends Shape{
    @Override
    void PrintArea()
    {
        System.out.println("Area of rectangle:" + (data1* data2));
    }
}
class Circle extends Shape{
    @Override
    void PrintArea()
    {
        System.out.println("Area of circle:"+(3.14*data1*data1));
    }
}
class Triangle extends Shape{
    @Override
    void PrintArea()
    {
        System.out.println("Area of triangle:"+(0.5*data1*data2));
    }
}
public class Abstract{
    public static void main(String[]args){
        Shape s = new Rectangle();
        s.data1=15;
        s.data2=19;
        s.PrintArea();
        s = new Circle();
        s.data1 = 5;
        s.PrintArea();
        s = new Triangle();
        s.data1 = 64;
        s.data2 = 43;
        s.PrintArea();
    }
}