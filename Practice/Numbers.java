public class Numbers{
    public static void main (String[]args)
    {
        int x = 15,y = 30, z = 99;
        if(x > y && x > z){
            System.out.println("x is bigger.");
        }
        else if(y > z){
            System.out.println("y is bigger.");
        }   
        else{
            System.out.println("z is bigger.");
        }
    }
}