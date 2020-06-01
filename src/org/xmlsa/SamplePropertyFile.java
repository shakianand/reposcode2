package org.xmlsa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SamplePropertyFile {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File ("C:\\Users\\admin\\eclipse-workspace30\\SamplexmlProject\\prop\\Details.properties");
		
		FileInputStream stream = new FileInputStream(f);
		
		Properties p = new Properties();
		
		p.load(stream);
		System.out.println("user name is : " + p.get("username"));
		System.out.println("password is : " + p.get("password"));
		System.out.println("name is : " + p.get("firstname"));
		System.out.println("ID is : " + p.get("id"));

		
		
		
		
		
	}

}
