package com.files.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyOldIO {

	public static void main(String[] args) {
		String sourceFile = "Files/Apps.txt";
		String destFile = "Files/NewFile.txt";
		
		// When we pass these 3 objects in the try as parameters they are AutoClosed.
		try(
			FileReader fReader = new FileReader(sourceFile);
			BufferedReader bReader = new BufferedReader(fReader);
			FileWriter fWriter = new FileWriter(destFile);
			)
		{
			while(true){
				String line = bReader.readLine();
				if(line != null){
					fWriter.write(line + "\n");
				}
				else{
					break;
				}
			}
			System.out.println("File Copied!!!");
		}
		catch(Exception e){
			System.out.println("Error in copying the file!");
		}
	}

}
