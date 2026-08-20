interface Shape{
    // int data1, data2;
     void PrintArea(int data1, int data2);
}
class Rectangle implements Shape{
    @Override
    // int data1,data2;
    public void PrintArea(int data1,int data2)
    {
        System.out.println("Area of rectangle:" + (data1* data2));
    }
}
class Circle implements Shape{
     @Override
    // int data1;
    public void PrintArea(int data1,int data2)
    {
        System.out.println("Area of circle:"+(3.14*data1*data1));
    }
}
class Triangle implements Shape{
     @Override
    // int data1,data2;
    public void PrintArea(int data1,int data2)
    {
        System.out.println("Area of triangle:"+(0.5*data1*data2));
    }
}
public class Interface{
    public static void main(String[]args){
        Shape s = new Rectangle();
        int data1=5;
        int data2=5;
        s.PrintArea(data1,data2);
        s = new Circle();
        // int data1 = 5;
        s.PrintArea(data1,data2);
        s = new Triangle();
        // int data1 = 64;
        // int data2 = 43;
        s.PrintArea(data1,data2);
    }
}