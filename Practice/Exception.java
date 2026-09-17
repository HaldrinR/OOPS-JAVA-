import java.util.Scanner;
public class Exception{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no.of elements:");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements:");
    for(int i=0;i<n;i++)
         arr[i] = sc.nextInt();
    System.out.println("Enter the index number:");
    int index = sc.nextInt();
    
    try {
        System.out.println("The element is:" + arr[index]);
        }    
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Exception caught in this program:"+ e);
        }
    finally{
        System.out.println("This block always executes........");
        }
    System.out.println("Program continues...........");
    }
}