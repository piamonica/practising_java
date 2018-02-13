

		

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.alaskaair.com/");
driver.findElement(By.xpath(".//*[@id='tab-hotels']")).click();
driver.findElement(By.xpath(".//*[@id='hotelOnlyToLocation']")).sendKeys("nyc");
Thread.sleep(3000);
driver.findElement(By.xpath(".//*[@id='hotelOnlyToLocation']")).sendKeys(Keys.TAB,Keys.ENTER);


	}

}
