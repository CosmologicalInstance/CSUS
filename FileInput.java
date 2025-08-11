import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
  public class main {
    public static void main {
      try [
        BufferedWriter writer = new BufferedWriter(FileWriter("Example.txt"));
        writer.write("Hello");
        writer.newLine();
        writer.write("Bye");
        writer.close();
        ]
        System.out.println("The text has been successfully stored in the file")
        } catch (IOException e) {
        System.out.println("Error:" + e.getMessage());
        }   
    }
}
