package org.xmlsa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class SamplePropertyWrite {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\admin\\eclipse-workspace30\\SamplexmlProject\\prop\\empty.properties");
		
		FileOutputStream out = new FileOutputStream(f);
		
		Properties p = new Properties();
		
		p.setProperty("Name", "Shakila");
		p.setProperty("MobileNumber", "989427947");
		p.setProperty("DateOfBirth", "April 14th 1984");
		
		p.store(out, "Datas of user");

		
		
	}

}
