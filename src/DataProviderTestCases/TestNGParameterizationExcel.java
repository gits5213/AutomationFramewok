package DataProviderTestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Utility.ExcelReader;

public class TestNGParameterizationExcel {
	public static ExcelReader excel = null;
	
	@Test (dataProvider="getData")
	public void testData(String username, String password, String is_correct){
		

		System.out.println(username+"..." + password +"...." + is_correct);
		

		
	}
	
	@DataProvider
	public static Object[][] getData(){
		//Create a object of the ExcelReader class
		if (excel == null){
			excel = new ExcelReader("C:\\Users\\Md. Shahnewaz Zaman\\ANGULARJS\\GmailRegistrationUITest\\testngdata.xlsx");
		}
		String sheetName = "loginTest";
		//excel.getRowCount(sheetName); //Sheet name I will needing again and again and then stored into the variable 
		int rows = excel.getRowCount(sheetName);
		int clos = excel.getColumnCount(sheetName); //Same I need the column count
				
		
		//will not count the first row //row will start from 2nd in the excel sheet
		//Object[][] data = new Object[2][3];  //2 Row and 3 Colomn
		Object[][] data = new Object[rows-1][clos];
		
		//Returning entire excel sheet data
		//write a loop -- rowNum-2 in excel sheet 
		for (int rowNum=2; rowNum<=rows; rowNum++){
			for(int colNum=0; colNum<clos; colNum++){
				// data [0][0]
				data [rowNum-2][colNum] = excel.getCellData(sheetName, colNum, rowNum); //storing the data into 2 dimantainal array
				
			}
			
		}
		
		
		return data;
	}

}
