import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framexample2 {

	

		public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/recaptcha/api2/demo");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
		int number = findframenumber(driver, By.cssSelector(".recaptcha-checkbox-checkmark"));
		driver.switchTo().frame(number);
		driver.findElement(By.cssSelector(".recaptcha-checkbox-checkmark")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);

		int number1 = findframenumber(driver, By.cssSelector("#recaptcha-reload-button"));
		driver.switchTo().frame(number1);
		driver.findElement(By.cssSelector(".button-holder.reload-button-holder")).click();

		}
	


public static int findframenumber(WebDriver Driver, By by)
{
	int i;
	int framecount= Driver.findElements(By.tagName("iframe")).size();
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
