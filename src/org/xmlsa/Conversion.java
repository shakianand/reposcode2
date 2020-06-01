package org.xmlsa;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Conversion {
	
	public static void main(String[] args) throws JAXBException {
		
		//creating JAXB context
		
		JAXBContext jb = JAXBContext.newInstance(Employee.class);
		
		//creating unmarshaller
		
		Unmarshaller un = jb.createUnmarshaller();
		
		//using unmarshel method
		
		//xml file path given ,  emp.xml path
		File f = new File("C:\\Users\\admin\\eclipse-workspace30\\SamplexmlProject\\emp.xml");
		
		Object o = un.unmarshal(f);
		//typecasting as we need to use employee class to retrieve the values
		Employee e = (Employee)o;
		
		//printing all the values
		System.out.println("Employee ID is : " + e.getId());
		System.out.println("Employee ID is : " + e.getName());
		System.out.println("Employee ID is : " + e.getEmail());
		System.out.println("Employee ID is : " + e.getPhone());



		
	}

}
