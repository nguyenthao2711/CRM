package CRM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class CRM {
	public  WebDriver driver;
	public String url ="http://14.176.232.213:8080/CRMweb/faces/login.xhtml?fbclid=IwAR1iB7WQPkbwofjacejyCyh87m3Kt4lSYK1qvB17m2Ng5iOTIqPa3uTUDbw";

  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium\\selenium_webdriver\\chromedriver.exe" );
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get(url);
  }
@Test(priority = 0)
public void Login() {
	driver.findElement(By.id("campaigntypeform:email")).click();
	driver.findElement(By.id("campaigntypeform:email")).clear();
	driver.findElement(By.id("campaigntypeform:email")).sendKeys("nguyenthao98@gmail.com");
	driver.findElement(By.id("campaigntypeform:pass")).click();
	driver.findElement(By.id("campaigntypeform:pass")).clear();
	driver.findElement(By.id("campaigntypeform:pass")).sendKeys("12345678");
	driver.findElement(By.cssSelector("#campaigntypeform > div:nth-child(4) > div > input")).click();
		
}
@Test(priority = 1)
public void addcampaign()
{
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.findElement(By.linkText("Campaigns")).click();
    driver.findElement(By.linkText("Create Campaign")).click();
    driver.findElement(By.xpath("//input[@id='j_idt70:cn']")).clear();
    driver.findElement(By.xpath("//input[@id='j_idt70:cn']")).sendKeys("aaa");
    driver.findElement(By.xpath("//option[contains(.,'lucky')]")).click();
    driver.findElement(By.xpath("//option[contains(.,'Yet')]")).click();
    driver.findElement(By.xpath("//input[@name='j_idt70:sd']")).clear();
    driver.findElement(By.xpath("//input[@name='j_idt70:sd']")).sendKeys("2019-09-01");
    driver.findElement(By.xpath("//input[@id='j_idt70:ed']")).clear();
    driver.findElement(By.xpath("//input[@id='j_idt70:ed']")).sendKeys("2019-09-10");
    driver.findElement(By.id("j_idt70:er")).clear();
    driver.findElement(By.id("j_idt70:er")).sendKeys("98012000");
    driver.findElement(By.id("j_idt70:bc")).clear();
    driver.findElement(By.id("j_idt70:bc")).sendKeys("500450");
    driver.findElement(By.id("j_idt70:ac")).clear();
    driver.findElement(By.id("j_idt70:ac")).sendKeys("123000");
    driver.findElement(By.name("j_idt70:de")).clear();
    driver.findElement(By.name("j_idt70:de")).sendKeys("hello");
    driver.findElement(By.xpath("//*[@id=\"j_idt70\"]/div[8]/div/input")).click();
  
  
}
@Test (priority = 2)
public void createProduct() {
	driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[5]/a/span[1]")).click();
	   driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[5]/ul/li[2]/a")).click();
	   driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div[2]/div/div/div/div[1]/h5")).click();
	   driver.findElement(By.id("bookForm:pn")).click();
	   driver.findElement(By.id("bookForm:pn")).sendKeys("nuoc ngot");
	   driver.findElement(By.id("bookForm:pp")).click();
	   driver.findElement(By.id("bookForm:pp")).sendKeys("20.000");
	   driver.findElement(By.id("bookForm:pd")).click();
	   driver.findElement(By.id("bookForm:pd")).sendKeys("0");
	   driver.findElement(By.name("bookForm:j_idt77")).click();
}
@Test (priority =3)
public void SearchProduct() {
	// Product
	driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[5]/a/span[1]")).click();
	//Show All Product
	   driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[5]/ul/li[1]/a")).click();
	 // "show product list"
	   driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div[2]/div/div/div/div[1]")).click();
	   driver.findElement(By.cssSelector("#productform\\:j_idt72\\:j_idt73\\:filter")).click();
	   driver.findElement(By.id("productform:j_idt72:j_idt73:filter")).sendKeys("Ao");
}
@Test (priority =4)
public void EditProduct() {
driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[5]/a/span[1]")).click();
driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[5]/ul/li[1]/a")).click();
driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div[2]/div/div/div/div[1]")).click();
driver.findElement(By.xpath("//*[@id=\"productform:j_idt72_data\"]/tr[2]/td[1]")).click();
	//select to change a product name 
driver.findElement(By.cssSelector("#productform\\:j_idt72_data > tr:nth-child(1) > td:nth-child(4) > div > div > a")).click();
driver.findElement(By.id("bookForm:pn")).click();
driver.findElement(By.id("bookForm:pn")).clear();
driver.findElement(By.id("bookForm:pn")).sendKeys("thaolucky");
driver.findElement(By.name("bookForm:j_idt79")).click();

	
}

	  


	
	   
	


	
	




  @AfterTest
  public void afterTest() {
  }

}
