import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Files{
    public static void main(String[]args){
        try{
            File obj = new File("santa.txt");
            Scanner Reader = new Scanner(obj);
            while(Reader.hasNextLine()){
                String data = Reader.nextLine();
                System.out.println(data);
            }
            FileWriter Writer = new FileWriter("clause.txt");
            Writer.write("Good morning Sunshine!!!!");
            Writer.close();
            System.out.println("Successfully written:)");
            Reader.close();
            
        }
        catch(FileNotFoundException e){
             System.out.println("An error has occured"+e);
        }
        catch(IOException e){
            System.out.println("An error has occured"+e);
        }
    }
}