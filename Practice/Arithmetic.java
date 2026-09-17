import java.util.Scanner;
public class Arithmetic{
    public static void main(String[]args){
        // double n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for n and m:");
        double n = sc.nextDouble();
        double m = sc.nextDouble();
        // try{
            double ans = n/m;
            System.out.println("Answer:"+ ans);
        // }
        // catch(ArithmeticException e){
            // System.out.println("Error:" +e);
        // }
    }
}