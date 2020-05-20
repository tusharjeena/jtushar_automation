package WebDriverClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.chrome.ChromeOptions;

public class SignupFb {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "/home/tushar/Desktop/chromedriver");
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("headless");
        
		driver.get("https://www.facebook.com");
		
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("Tushar");
		
		WebElement lname = driver.findElementById("u_0_o");
		lname.sendKeys("Jeena");
		
		WebElement phone = driver.findElementById("u_0_r");
		phone.sendKeys("9876543210");
		
		WebElement pass = driver.findElementByCssSelector("#u_0_w");
		pass.sendKeys("Password.1");
		
		WebElement day = driver.findElementByCssSelector("select#day");	
		Select s = new Select(day);
		s.selectByIndex(24);
		
		WebElement month = driver.findElementByCssSelector("select#month");
		Select s1 = new Select(month);
		s1.selectByVisibleText("Mar");
		
		WebElement year = driver.findElementByCssSelector("select#year");
		Select s2 = new Select(year);
		s2.selectByValue("1992");
			
		WebElement radio = driver.findElement(By.xpath("//span[2]//input[1]"));
		radio.click();
		
		WebElement submit = driver.findElementById("u_0_13");
		submit.click();		
		
	}

}
