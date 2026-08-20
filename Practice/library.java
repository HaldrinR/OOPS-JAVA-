import java.util.Scanner;
import java.util.Arrays;
public class library{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of books:");
        int num = sc.nextInt();
        sc.nextLine();
        String[]books = new String[num];
        for(int i=0;i<num;i++){
            System.out.println("book name:");
            books[i]=sc.nextLine();
        }
          
    }
}