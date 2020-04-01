import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {

	public ReadExcel(String fileName, String sheetName) throws Exception {
		// TODO Auto-generated constructor stub
		
		File f=new File(fileName);
		FileInputStream fileInputStream=new FileInputStream(f);
		Workbook workbook=null;
		Sheet sheet;
		Row rowData;
		int numberOfRows;
		
		if(fileName.substring(fileName.indexOf(".")).equals(".xlsx"))
		{
			workbook = new XSSFWorkbook(fileInputStream);
		}
		else if (fileName.substring(fileName.indexOf(".")).equals(".xls")) {
			workbook =new HSSFWorkbook(fileInputStream);
		}
		sheet= workbook.getSheet(sheetName);
		numberOfRows = sheet.getLastRowNum() - sheet.getFirstRowNum();
		for(int i=0;i<numberOfRows;i++)
		{
			rowData=sheet.getRow(i);
			for(int j=0;j<rowData.getLastCellNum();j++)
			{
				System.out.print(rowData.getCell(j).getStringCellValue());
			}
			System.out.println();
		}
		
	}

}
