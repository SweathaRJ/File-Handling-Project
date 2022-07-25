package fileHandlingExample;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class ReadAppend {
	
	public static  void readFileFileInputStream() throws IOException
	{
		
		FileInputStream stream= new FileInputStream("D:\\Sweatha\\Sweatha1.txt");
		int data;
		
		while((data=stream.read())!=-1){
			
			System.out.print((char)data);
		}
		
		Path path1=Paths.get("D:\\Sweatha\\Sweatha1.txt");
		List<String> list=Arrays.asList("This is the first line in my new file","This is the second line in my new file");
		Files.write(path1, list, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println("\nLines Written Successfully");
		
	}
	public static void main(String[] args) {
		try {
			readFileFileInputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("File not available");
		}
	}


}
