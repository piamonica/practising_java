import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("http://path2usa.com/travel-companions");
		//Understanding how to select a specific Date
		Driver.findElementByXPath("//input[@id='travel_date']").click();
		
		while(!Driver.findElementByCssSelector("[class='datepicker-days'] [class='datepicker-switch']").getText().contains("May"))
		{
			Driver.findElementByCssSelector("[class='datepicker-days'] th[class='next']").click();
		}
		
        List<WebElement>Date= Driver.findElementsByClassName("day");
		
		int count=Driver.findElementsByClassName("day").size();
		for( int i=0;i<count;i++)
		{
			 String Text= Driver.findElementsByClassName("day").get(i).getText();
	         if(Text.equalsIgnoreCase("26"))
	    		   {
	        	     Driver.findElementsByClassName("day").get(i).click();
	        	     break;
	    		   }	
		/*Driver.get("http://makemytrip.com");
		Driver.findElementByXPath("//input[@id='travel_date']").click();
		
		List<WebElement> Date =Driver.findElementsByCssSelector("td[data-handler='selectDay']");
			int Count= Driver.findElementsByCssSelector("td[data-handler='selectDay']").size();
			for( int i=0;i>Count;i++)
			{
				String Text=Driver.findElementsByCssSelector("td[data-handler='selectDay']").get(i).getText();
				if (Text.equalsIgnoreCase("10"))
				{
					Driver.findElementsByCssSelector("td[data-handler='selectDay']").get(10).click();
					break;
				}*/
			}  
			
		}
		
}	
	
	


