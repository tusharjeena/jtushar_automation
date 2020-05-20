package WebDriverClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericMethod {
	
	public void drpDwnSel(WebElement element, String visibleText)
	{
		Select s = new Select(element);
		s.selectByVisibleText(visibleText);
				
	}
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "/home/tushar/Desktop/chromedriver");
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		driver.get("https://www.facebook.com");
		GenericMethod gen = new GenericMethod();
		
		WebElement day = driver.findElementById("day");
		gen.drpDwnSel(day,"24");
		
		WebElement month = driver.findElementById("month");
		gen.drpDwnSel(month, "Mar");
		
		WebElement year = driver.findElementById("year");
		gen.drpDwnSel(year, "1992");

	}

}
