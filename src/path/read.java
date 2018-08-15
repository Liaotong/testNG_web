package path;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;





public class read{
	public static String readEmail(int row) throws Exception{
		// ��ȡexcel�ļ������� 
		String address= "D:/UCN/read.xlsx";
		// ��ȡexcel�ļ� 
		FileInputStream fi = new FileInputStream(address);
		//xslx
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fi);
		
		// �������ƻ�ȡָ����excel������ 
		XSSFSheet sheet = hssfWorkbook.getSheet("user"); 
		XSSFRow sfdsf = sheet.getRow(row); 
		String name = sfdsf.getCell(0).getStringCellValue();
		return name;
	}
	public static String readPassWord(int row) throws Exception{
		// ��ȡexcel�ļ������� 
		String address2= "D:/UCN/read.xlsx";
		// ��ȡexcel�ļ� 
		FileInputStream fi1 = new FileInputStream(address2);
		//xslx
		XSSFWorkbook hssfWorkbook2 = new XSSFWorkbook(fi1);
		
		// �������ƻ�ȡָ����excel������ 
		XSSFSheet sheet2 = hssfWorkbook2.getSheet("user"); 
		XSSFRow sfdsf2 = sheet2.getRow(row); 
//		Cell numCell = sfdsf2.getCell(1).setCellType(Cell.CELL_TYPE_STRING);
//		String passWord = numCell.getStringCellValue();
		String passWord = sfdsf2.getCell(1).getStringCellValue();
		return passWord;
	}
	public static String readAddress(int row) throws Exception{
		// ��ȡexcel�ļ������� 
		String address= "D:/UCN/read.xlsx";
		// ��ȡexcel�ļ� 
		FileInputStream fi = new FileInputStream(address);
		//xslx
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fi);
		
		// �������ƻ�ȡָ����excel������ 
		XSSFSheet sheet = hssfWorkbook.getSheet("address"); 
		XSSFRow sfdsf = sheet.getRow(row); 
		String path = sfdsf.getCell(0).getStringCellValue();
		return path;
	}
	
}

	