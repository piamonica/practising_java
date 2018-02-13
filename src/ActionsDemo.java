
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com");
	Actions a= new Actions (driver);
	WebElement move=driver.findElement(By.id("nav-link-accountList"));
	a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
	a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick();
	a.moveToElement(move).contextClick().build().perform();
	Thread.sleep(1000);
	driver.findElement(By.id("twotabsearchtextbox")).clear();
	Thread.sleep(1000);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("hola");
   }	
 }