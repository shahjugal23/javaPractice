package com.files.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyNewIO {

	public static void main(String[] args) {
		Path sPath = Paths.get("Files", "Apps.txt");
		Path dPath = Paths.get("Files", "NewFile.txt");
		
		try {
			Files.copy(sPath, dPath, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("File Copied!! ");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
