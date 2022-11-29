package utility;

public class Calling 
{

	public static void main(String[] args) throws InterruptedException
	{
		//browser launch
		Object [] input=new Object[2];
				  input[0]="webdriver.chrome.driver";
				  input[1]="F:\\Automation Support\\chromedriver.exe";
				  SelenuimOperations.browserLaunch(input);
				  
		//open application
		Object [] input1=new Object[1];
				  input1[0]="https://www.flipkart.com/";
				  SelenuimOperations.openapplication(input1);
							  
		//click on element
		Object [] input2=new Object[1];
				  input2[0]="//*[@class='_2KpZ6l _2doB4z']";
				  SelenuimOperations.clickonElement(input2);
				  
		//mouse over on login button
		Object [] input3=new Object[1];
				  input3[0]="//*[@class='_2KpZ6l _2doB4z']";
				  SelenuimOperations.mouseOver(input3);
				  
		//click on my profile
		 Object []input4=new Object[1];
				  input4[0]="//*[text()='My Profile']";
				  SelenuimOperations.clickonElement(input4);
				  
			Thread.sleep(5000);	  
		//enter username
		Object []input5=new Object[2];
				 //input5[0]="(//*[@type='text'])[2]";
				 input5[0]="(//*[@type='text'])[2]";
				 input5[1]="mohinispujari@gmail.com";
				 SelenuimOperations.EmailAddress(input5);
				 
			Thread.sleep(5000);	  
		//enter password
		Object []input6=new Object[2];
				 input6[0]="//*[@type='password']";
				 input6[1]="mohini123";
				 SelenuimOperations.EmailAddress(input6);
				 
			Thread.sleep(5000);	
				 
		//click on login button
		Object [] input7=new Object[1];
				  input7[0]="(//*[text()='Login'])[3]";
				  SelenuimOperations.clickonElement(input7);
				  
			Thread.sleep(5000);		  
		//click on manage address
		Object [] input8=new Object[1];
				  input8[0]="//*[text()='Manage Addresses']";
				  SelenuimOperations.clickonElement(input8);
				  
			Thread.sleep(5000);		  
		//click on add address
		Object [] input9=new Object[1];
				  input9[0]="//*[@class='_1QhEVk']";
				  SelenuimOperations.clickonElement(input9);
				  
			  
		//enter name field
		Object []input10=new Object[2];
				 input10[0]="//*[@name='name']";
				 input10[1]="Mohini Kamatkar";
				 SelenuimOperations.EmailAddress(input10);
				 
			  
		//enter mobile number
		Object []input11=new Object[2];
				 input11[0]="//*[@name='phone']";
				 input11[1]="8329568578";
				 SelenuimOperations.EmailAddress(input11);
				 
		//enter pincode
		Object []input12=new Object[2];
				 input12[0]="//*[@name='pincode']";
				 input12[1]="411028";
				 SelenuimOperations.EmailAddress(input12);
				  
	   //enter locality
		Object []input14=new Object[2];
			     input14[0]="//*[@name='addressLine2']";
				 input14[1]="Hadapsar";
				 SelenuimOperations.EmailAddress(input14);
			
		//enter addressline
		Object []input15=new Object[2];
				 input15[0]="//*[@name='addressLine1']";
			     input15[1]="Gadital near bus stand hadapsar";
				 SelenuimOperations.EmailAddress(input15);
				 
			Thread.sleep(5000);		  
		//click on save button
		Object [] input16=new Object[1];
				  input16[0]="(//*[@type='button'])[2]";
				  SelenuimOperations.clickonElement(input16);
				 
										  
							  
				  
				 
				 
							  
				  
        
						  
		 
					 
				  
										  
		
										  					  
							  
	}
		
	
}
