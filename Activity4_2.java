package javaActivity4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity4_2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try {
			File file = new File("C:\\SE-United\\WP\\OnlineStore\\src\\javaActivity4/newfile.txt");
			boolean fStatus = file.createNewFile();
			if(fStatus) {
				System.out.println("File created successfully ");
			}
			else {
				System.out.println("File Already exists in filepath");
			}
			
			File fileUtil = FileUtils.getFile("C:\\\\SE-United\\\\WP\\\\OnlineStore\\\\src\\\\javaActivity4/newfile.txt");
			System.out.println("Data in file :"+FileUtils.readFileToString(fileUtil, "UTF8"));
			
			File destDir = new File("resources");
			FileUtils.copyFileToDirectory(file, destDir);
			
			File newFile = FileUtils.getFile(destDir,"newfile.text");
			String newFileData = FileUtils.readFileToString(newFile,"UTF8");
			
			//Print it
			System.out.println("Data in new File :"+newFileData);
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		

	}

}
