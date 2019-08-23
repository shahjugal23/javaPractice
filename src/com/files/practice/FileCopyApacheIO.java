package com.files.practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileCopyApacheIO {

	public static void main(String[] args) {
		File source = new File("Files/Apps.txt");
		File dest = new File("Files/NewFile.txt");
		
		try {
			FileUtils.copyFile(source, dest);
			
			System.out.println("File is copied!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
