package labFileInput;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class addToLake
{
	public static void main(String[] args) throws FileNotFoundException
	{
		String contentToAppend = "Test String";
		try
		{
			Files.write(
					Paths.get("Lakes1.csv"),
					contentToAppend.getBytes(),
					StandardOpenOption.APPEND);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	
}
