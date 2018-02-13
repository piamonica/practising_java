import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("https://www.google.com/recaptcha/api2/demo");
		int number=findframenumber(Driver,By.xpath("//div[@class='recaptcha-checkbox-checkmark']"));
		Driver.switchTo().frame(number);
		Driver.findElementByXPath("//div[@class='recaptcha-checkbox-checkmark']").click();
		Driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		int number1=findframenumber(Driver,By.xpath("//button[@class='rc-button-default goog-inline-block']"));
		Driver.switchTo().frame(number1);
		Driver.findElementByXPath("//button[@class='rc-button-default goog-inline-block']").click();
		
		
		
		
		
	}

	
	
	
	//Generic method to identify an object in a frame if frame id is not available
	
	public static int findframenumber(ChromeDriver Driver, By by)
	{
		int i;
		int framecount= Driver.findElementsByTagName("iframe").size();
	for(i=0;i<framecount;i++)
	{
		Driver.switchTo().frame(i);
		int Count= Driver.findElements(by).size();
		
	if(Count>0)
	{
		Driver.findElement(by);
		break;
	}
	else
	{
		
	}
	}
	 Driver.switchTo().parentFrame();
	 return i;
	 
	}
}
