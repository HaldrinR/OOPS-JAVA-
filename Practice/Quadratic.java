public class Quadratic{
    public static void main(String[]args){
        float a=10,b=-3,c=9;
        float d=b*-4*a*c;
        if(d>0){
            float r1=(-b+(float)Math.sqrt(d)/(2*a));
            float r2=(-b-(float)Math.sqrt(d)/(2*a));
            System.out.println("Root 1 = "+r1);
            System.out.println("Root 2 = "+r2);
        }
        else{
            System.out.println("No real roots.");
        }
    }
}