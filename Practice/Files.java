// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.io.FileNotFoundException;
// import java.util.Scanner;
import java.util.*;
import java.io.*;
public class Files{
    public static void main(String[]args){
        try{
            FileReader obj = new FileReader("santa.txt");
            FileWriter Writer = new FileWriter("clause.txt");
            int a;
            while((a=obj.read())!=-1){
                Writer.write(a);
            }
            // Scanner Reader = new Scanner(obj);
            // while(Reader.hasNextLine()){
                // String data = Reader.nextLine();
                // System.out.println(data);
            // }
            
            // Writer.write("Good morning Sunshine!!!!");
            Writer.close();
            System.out.println("Successfully written:)");
            obj.close();
            
        }
        catch(FileNotFoundException e){
             System.out.println("An error has occured"+e);
        }
        catch(IOException e){
            System.out.println("An error has occured"+e);
        }
    }
}