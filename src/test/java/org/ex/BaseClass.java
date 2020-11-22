package org.ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public static 	WebDriver driver;
	
	public static WebDriver Launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\db programs\\Pom_ex\\src\\test\\java\\driver\\chromedriver.exe");
         driver=new ChromeDriver();
         
         return driver;
	}
	     public static void openpage(String url) {
			
	    	 driver.get(url);

		}
	       public static void big() {
			driver.manage().window().maximize();

		}
	       public static void navigate() {
			driver.navigate().to("https://www.redbus.in/");

		}
	       public static  void back() {
		   driver.navigate().back();

		}
	       public static void forward() {
			driver.navigate().forward();

		}
	       public static void refresh() {
			driver.navigate().refresh();

		}
	       
	       public static void input(WebElement e,String text) {
			e.sendKeys(text);

		}
	       
	       public static void btn(WebElement e) {
			e.click();

		}
	       public static void attr(WebElement e)
	       {
	    	   String s = e.getAttribute("value");
	    	   System.out.println(s);
	       }
	       
	       public static String read(int rowno,int colno) throws IOException
	       {
	    	 
	    	   File f=new File("C:\\db programs\\Pom_ex\\excel\\books.xlsx");
	    	   FileInputStream fin=new FileInputStream(f);
	    	   Workbook w=new XSSFWorkbook(fin);
	    	   Sheet s=w.getSheet("stud");
	    	   Row r=s.getRow(rowno);
	    	   String t="";
	    	          Cell c = r.getCell(colno);
	    	               CellType e = c.getCellType();
	    	               if(e==e.STRING)
	    	               {
	    	            	   t = c.getStringCellValue();
	    	               }
	    	               else
	    	            	   if(e==e.NUMERIC)
	    	            	   {
	    	            		   if(DateUtil.isCellDateFormatted(c)) {
									Date date = c.getDateCellValue();
									System.out.println(date);
									SimpleDateFormat sim=new SimpleDateFormat("dd/MM/yyyy");
									          t = sim.format(date);
								}
	    	            		   else
	    	            		   {
	    	            			   double d = c.getNumericCellValue();
	    	            			   long l=(long)d;
	    	            			   t = String.valueOf(l);
	    	            			   }
	    	            	   }
	    	   return t;
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	       }
         
	}


