package org.xmlsa;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class StudConversion {
	
	public static void main(String[] args) throws JAXBException {
		

		JAXBContext j = JAXBContext.newInstance(Student.class);
		Unmarshaller un = j.createUnmarshaller();
		File f = new File("C:\\Users\\admin\\eclipse-workspace30\\SamplexmlProject\\stud.xml");
		Object o = un.unmarshal(f);
		//typecasting
		Student s = (Student)o;
		System.out.println("Student Id : " + s.getId());
		System.out.println("Student Name : " + s.getName());
		System.out.println("Student Department : " + s.getDepartment());
		//System.out.println("Student Id : " + s.getId());



		
		
	}

}
