package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SelenuimOperations;

public class Login 
{
	@When ("^user provide \"(.*)\" and exe location as \"(.*)\"$")
		public void bLaunch(String key, String exe)
		{
			Object[] input=new Object[2];
		  		 	 input[0]=key;
		  		 	 input[1]=exe;
		  		 	 SelenuimOperations.browserLaunch(input);
		}
	@When ("^user provide url as \"(.*)\"$")
		public void openAp(String url)
		{
			Object [] input1=new Object[1];
		  		  	  input1[0]=url;
		  		  	  SelenuimOperations.openapplication(input1);
		}
		
	@When ("^user cancel initial login page$")
		public void cancel() 
		{
			Object [] input2=new Object[1];
		  		  	  input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		  		  	  SelenuimOperations.clickonElement(input2);
		}
	
	@When ("^user navigate on Login$")
		public void navigate()
		{
			Object [] input3=new Object[1];
					  input3[0]="//*[@class='_2KpZ6l _2doB4z']";
					  Hashtable<String,Object> output3=SelenuimOperations.mouseOver(input3);
					  
			HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "^user navigate on Login$", output3.get("MESSAGE").toString());
		}
	@When ("^user click on My Profile$")
		public void myprofile() throws InterruptedException 
		{
		 	Object []input4=new Object[1];
		 			 input4[0]="//*[text()='My Profile']";
		 			 Hashtable<String,Object> output4=SelenuimOperations.clickonElement(input4);
		 	HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"^user click on My Profile$" , output4.get("MESSAGE").toString());
		 			 Thread.sleep(5000);
		 			 
		 }
	
	@When("^user enter as \"([^\"]*)\" as username$")
		public void username(String name) throws InterruptedException 
		{
		  	Object [] input5=new Object[2];
		  			  input5[0]="(//*[@type='text'])[2]";
		              input5[1]=name;
		              Hashtable<String,Object> output5=SelenuimOperations.EmailAddress(input5);
		    HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^user enter as \"([^\"]*)\" as username$", output5.get("MESSAGE").toString());
		              Thread.sleep(5000);
		 }
	

	@When("^user enter as \"([^\"]*)\"as password$")
    	public void password(String pass) throws InterruptedException 
    	{
    		Object []input6=new Object[2];
    				 input6[0]="//*[@type='password']";
    				 input6[1]=pass;
    				 Hashtable<String,Object> output6=SelenuimOperations.EmailAddress(input6);
    		HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^user enter as \"([^\"]*)\"as password$", output6.get("MESSAGE").toString());
    				 Thread.sleep(5000);	
        }

    @When("^user click on Login button$")
    	public void user_click_on_Login_button()
    	{
    		Object [] input7=new Object[1];
    				  input7[0]="(//*[text()='Login'])[3]";
    				  Hashtable<String,Object> output7=SelenuimOperations.clickonElement(input7);
    	    HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user click on Login button$", output7.get("MESSAGE").toString());
    	}
    
    @Then("^application shows user profile to user$")
    public void application_shows_user_profile_to_user() throws Throwable
    {
    		Object [] input8=new Object[1];
    				  input8[0]="https://www.flipkart.com/account/login?ret=%2Faccount%2F%3Frd%3D0%26link%3Dhome_account";
    				  Hashtable<String,Object> output8=SelenuimOperations.validateLogin(input8);
    		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^application shows user profile to user$", output8.get("MESSAGE").toString());
    	
    }
    

  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
