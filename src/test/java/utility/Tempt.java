package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//browser launch
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Support\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//open application
		driver.get("https://www.flipkart.com/");
		
		//click on cancel button
		driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
		
		//move to element
		Actions act=new Actions(driver);
		
		WebElement a=driver.findElementByXPath("//*[text()='Login']");
		act.moveToElement(a).build().perform();
		
		//click on my profile
		driver.findElementByXPath("//*[text()='My Profile']").click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//enter username
		driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("mohinispujari@gmail.com");
		
		//enter password
		driver.findElementByXPath("//*[@type='password']").sendKeys("mohini123");
		
		//click on login button
		driver.findElementByXPath("(//*[text()='Login'])[3]").click();
		
		Thread.sleep(5000);
		
		//click on manage address
		driver.findElementByXPath("//*[text()='Manage Addresses']").click();
		
		//click on add new address
		driver.findElementByXPath("//*[@class='_1QhEVk']").click();
		
		// name field
		driver.findElementByXPath("//*[@name='name']").sendKeys("Mohini Kamatkar");
		
		// mobile number field
		driver.findElementByXPath("//*[@name='phone']").sendKeys("8329568578");
		
		//pincode
		driver.findElementByXPath("//*[@name='pincode']").sendKeys("411028");
		
		//locality
		driver.findElementByXPath("//*[@name='addressLine2']").sendKeys("Hadapsar");
		
		//addressline
		driver.findElementByXPath("//*[@name='addressLine1']").sendKeys("Gadital near bus stand hadapsar");
		
		//click on save button
		driver.findElementByXPath("(//*[@type='button'])[2]").click();
		
		

		}

}
