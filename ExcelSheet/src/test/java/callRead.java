import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class callRead {

	@Test
	public void callExceclRead() throws Exception {
		Properties properties = new Properties();
		File src = new File("/Users/Raghu/Documents/Git_Jenkins/JenkinsPractice/ExcelSheet/configuration/config.properties");
		FileInputStream ip = new FileInputStream(src);
		properties.load(ip);
		String fileName = properties.getProperty("fileName");
		String sheetName = properties.getProperty("sheetName");
		
		ReadExcel readExcel=new ReadExcel(fileName, sheetName);
		
		
	}

}
