import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling_FileReader
{	public static void main(String[] args) throws IOException
	{
		String fileName = "file_for_filereader.txt";
		BufferedReader buffread = new BufferedReader(new FileReader(fileName));
		try {
		    String line;
		    while ((line = buffread.readLine()) != null) {
		       System.out.println(line);
		    }
		} finally {
		    buffread.close();
		}
	}
}