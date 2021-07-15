import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferredReaderProgram {
    public static void main(String[] args) throws IOException{
        //Ask for user input
        System.out.println("Enter the Name:");

        //BufferedReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
        //ReadLine will read the string
        String name = reader.readLine();
        //Print back the readed string
        System.out.println("Name is :"+name);
        
      
    }
}
