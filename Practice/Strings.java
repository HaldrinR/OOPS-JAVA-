import java.util.Scanner;
public class Strings{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string 1:");
        String s1 = sc.nextLine();
        // System.out.println("Enter a")
        // String s1="Halen";
        System.out.println("Concatenation:"+s1.concat(" Ha Ha"));
        System.out.println("Length of the string is:"+s1.length());
        System.out.println("Lower Case Conversion:"+s1.toLowerCase());
        System.out.println("Upper Case Conversion:"+s1.toUpperCase());
        System.out.println("Substring of the "+s1+" is "+s1.substring(1,3));
        System.out.println("Equals: "+s1.equals("Power"));
        // System.out.println("Append:"+s1.append("World"));
    }
} 