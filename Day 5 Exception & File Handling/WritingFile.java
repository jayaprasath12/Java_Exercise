import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {

    public static void main(String[] args) {
        String stringToWrite = "Writing done successfully";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("filewriting.txt"));
            writer.write(stringToWrite);
            writer.close();
        } catch (IOException ioe) {
            System.out.println("Couldn't write to file");
        }
    }
}