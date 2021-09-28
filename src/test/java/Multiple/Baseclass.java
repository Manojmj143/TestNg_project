package Multiple;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Baseclass {
	
	public static WebDriver driver;
	private static String path;
	
	public static WebDriver browser (String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
				"G:\\workspace\\selenium\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		return driver;
	}
	
	public static void getUrl(String Url) {
		driver.get(Url);
	}
		
	public static void clickOnElement(WebElement ele) {
		ele.click();
		
	}
	public static void  inputValue(WebElement ele , String value) {
		ele.sendKeys(value);
	}
	public static void  moveToElement(WebElement ele ) {
		 Actions a = new Actions(driver);
		 a.moveToElement(ele).build().perform();
	}
	
	public static void waitTime_sec(int a) {
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	public  static void dropdown_ByIndex(WebElement ele,int index) {
		  Select s = new Select(ele);
	        s.selectByIndex(index);
		
	}
	public static void scrollView() {
		 JavascriptExecutor j = (JavascriptExecutor)driver;
	        j.executeScript("window.scrollBy(0,500)");
	}
	public static void takescreenShot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		Files.copy(source,destination);
		
	}
	public static String read_Particular_Data(String path,int row_index ,int cell_index) throws IOException {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook w= new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row =sheetAt.getRow(row_index);
		Cell cel =row.getCell(cell_index);
		CellType type =cel.getCellType();
		String value = null;
		if (type.equals(CellType.STRING)) {
			 value = cel.getStringCellValue();
		}
		else if (type.equals(CellType.NUMERIC)) {
			double numericcellvalue = cel.getNumericCellValue();
			 value = Double.toString(numericcellvalue);
		}
		w.close();
		return value;
		
		
	}
	
	
	
	
	
	
	
}
