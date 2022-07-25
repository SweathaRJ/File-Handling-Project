package fileHandlingExample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
	
	public static void createFileUsingFileClass() throws IOException
	{
		//create file
		File file= new File("D:\\Sweatha\\Sweatha1.txt");
		
		if(file.createNewFile()) {
			System.out.println("File is Created");
		}
		else {
			System.out.println("File  is already Exist");
		}
		
		//write data to that file
		FileWriter  writer= new  FileWriter(file,false);//overWrites file
		//FileWriter  writer= new  FileWriter(file,true);//appends File
		writer.write(" Welcome to my new file! I am craeting a file.");
		writer.close();
      }
	
	public static void main(String[] args) {
		try {
			createFileUsingFileClass();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
