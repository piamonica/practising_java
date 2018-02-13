import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class againebay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		String Before;
		String After;
		Driver.get("https://www.ebay.com/");
		System.out.println("Number of links on the page:");
		System.out.println(Driver.findElementsByTagName("a").size());
		System.out.println("Number of links on the Footer section");
		WebElement Footer= Driver.findElementById("glbfooter");
		System.out.println(Footer.findElements(By.tagName("a")).size());
		WebElement col= Driver.findElementByXPath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul");
		int Count=col.findElements(By.tagName("a")).size();
		System.out.println(Count);
		for(int i=0;i<Count;i++)
		{
			if(col.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
			{
				//System.out.println("Title of page before clicking");
				Before= Driver.getTitle();
				col.findElements(By.tagName("a")).get(i).click();
				After= Driver.getTitle();
				//System.out.println("After clicking");
			if (Before==After)
			{
					boolean abc = Driver.findElementByXPath("html/body/div[2]/div/h1").isDisplayed();
					if (abc==true)
				{
						System.out.println("Pass");
				}
			}
			else 
				System.out.println("Fail");
			}
			
		}
		Driver.close();
	}
	

}
