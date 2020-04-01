package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertiesFileConcept {

	@Test
	public void login() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis = new FileInputStream("/Users/Raghu/Documents/Git_Jenkins/JenkinsPractice/Udemy2/src/TestNG/data.properties");
		prop.load(fis);
		System.out.println("From file :"+prop.getProperty("username"));
	}
}
