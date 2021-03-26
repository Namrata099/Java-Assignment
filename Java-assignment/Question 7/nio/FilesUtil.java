package com.nio;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesUtil {
	
	public static void main(String[] args) {
		
		Path path = Paths.get("E:\\ECLIPSE\\assignment-java\\src\\file.txt");
		try{
		 
		  List<String> contents = Files.readAllLines(path);
		 
		  //Read from the stream
		  for(String content:contents){   //for each line of content in contents
		    System.out.println(content);  // print the line
		  }
		 
		  }catch(IOException ex){
		  ex.printStackTrace();//handle exception here
		}
	}
	

}
