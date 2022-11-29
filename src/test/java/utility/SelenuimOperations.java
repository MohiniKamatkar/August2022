package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelenuimOperations 
{
	public static ChromeDriver driver=null;
	
	public static Hashtable<String,Object> outputparameters=new Hashtable<String,Object>();
	
	//browser launch
		public static Hashtable<String,Object> browserLaunch(Object [] inputparameters) 
			{
				try
				{
				String key= (String) inputparameters[0];
				
				
				String value=(String) inputparameters[1];
		
				System.setProperty(key,value);
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				outputparameters.put("STATUS", "PASS");
				outputparameters.put("MESSAGE", "methodUsed:browserLaunch, InputGiven: " + inputparameters[0].toString());
				
				}catch(Exception e)
				{
					outputparameters.put("STATUS", "FAIL");
					outputparameters.put("MESSAGE", "methodUsed:browserLaunch, InputGiven: " + inputparameters[0].toString());
					
				}
				
				return outputparameters;
			}
	//open application
				public static Hashtable<String,Object> openapplication(Object [] inputparameters) 
					{
						try
						{
						String url= (String) inputparameters[0];
				
						driver.get(url); 
						driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
						outputparameters.put("STATUS", "PASS");
						outputparameters.put("MESSAGE", "methodUsed:openapplication, InputGiven: " + inputparameters[0].toString());
						
						}catch(Exception e)
						{
							outputparameters.put("STATUS", "FAIL");
							outputparameters.put("MESSAGE", "methodUsed:openapplication, InputGiven: " + inputparameters[0].toString());
						}
						return outputparameters;
					}
	//click on element
				public static Hashtable<String,Object> clickonElement(Object [] inputparameters) 
					{
						try
						{
						String xpath= (String) inputparameters[0];
				
						driver.findElementByXPath(xpath).click();
						driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
						outputparameters.put("STATUS", "PASS");
						outputparameters.put("MESSAGE", "methodUsed:clickonElement, InputGiven: " + inputparameters[0].toString());
						}catch(Exception e)
						{
							outputparameters.put("STATUS", "FAIL");
							outputparameters.put("MESSAGE", "methodUsed:clickonElement, InputGiven: " + inputparameters[0].toString());
						}
						return outputparameters;
					}
	//mouse over on login button
				public static  Hashtable<String,Object> mouseOver(Object [] inputparameters) 
					{
						try
						{
						String xpath= (String) inputparameters[0];
				
						Actions act=new Actions(driver);
						
						WebElement a=driver.findElementByXPath("//*[text()='Login']");
						act.moveToElement(a).build().perform();
						driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
						outputparameters.put("STATUS", "PASS");
						outputparameters.put("MESSAGE", "methodUsed:mouseOver, InputGiven: " + inputparameters[0].toString());
						}catch(Exception e)
						{
							outputparameters.put("STATUS", "FAIL");
							outputparameters.put("MESSAGE", "methodUsed:mouseOver, InputGiven: " + inputparameters[0].toString());
						}
						return outputparameters;
					}
				
	//enter username
				public static Hashtable<String,Object> EmailAddress(Object [] inputparameters) throws InterruptedException 
				{	
						try
						{
						String xpath = (String) inputparameters[0];
						String value=(String) inputparameters[1];
					
						driver.findElementByXPath(xpath).sendKeys(value);
						driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
						outputparameters.put("STATUS", "PASS");
						outputparameters.put("MESSAGE", "methodUsed:EmailAddress, InputGiven: " + inputparameters[1].toString());
					
						}catch(Exception e)
						{
							outputparameters.put("STATUS", "FAIL");
							outputparameters.put("MESSAGE", "methodUsed:EmailAddress, InputGiven: " + inputparameters[1].toString());
						
						}
						return outputparameters;
						
				}
				
	//validate login
				public static Hashtable<String,Object> validateLogin(Object [] inputparameters) 
					{
						try
						{
						String requiredUrl= (String) inputparameters[0];
						
						String catchUrl	= driver.getCurrentUrl();
						
						System.out.println(requiredUrl);
						System.out.println(catchUrl);
						driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
						
						
						if(catchUrl.equalsIgnoreCase(requiredUrl))
						{
							System.out.println("Test case Pass");
							outputparameters.put("STATUS", "PASS");
							outputparameters.put("MESSAGE", "methodUsed:validateLogin, InputGiven: " + inputparameters[0].toString());
						}
						else
						{
							System.out.println("Test case Fail");
						}
						
						}catch(Exception e)
						{
							outputparameters.put("STATUS", "FAIL");
							outputparameters.put("MESSAGE", "methodUsed:validateLogin, InputGiven: " + inputparameters[0].toString());
						}
						return outputparameters;
					}			
	
	
				
				
			
		}
