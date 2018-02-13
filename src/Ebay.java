import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		String Before = null;
		String After;
		Driver.get("http://www.ebay.com/");
		//Count the number of links 
		System.out.println("The total number of links on the webpage are");
		System.out.println(Driver.findElements(By.tagName("a")).size());
		//Count number of links on the Footer section
		WebElement Footer=Driver.findElementByXPath(".//*[@id='glbfooter']");
		System.out.println("The number of links on the Footer are");
		System.out.println(Footer.findElements(By.tagName("a")).size());
		//Count number of links in a single column on Footer
		WebElement col=Driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));

        System.out.print("Total number links in Footer Column2 for ebay Home Page :");

        System.out.println(col.findElements(By.tagName("a")).size());

        for(int i=1; i<col.findElements(By.tagName("a")).size();i++)
        {

         if (col.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
         {
        	 Before= Driver.getTitle();
        	 System.out.println(Driver.getTitle());
        	 col.findElements(By.tagName("a")).get(i).click();
        	 break;
        }
             After = Driver.getTitle();
		if(Before!=After)
		{
			if(Driver.getPageSource().contains("All categories"))
		
				System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
			
	}
		                   
		}

}
