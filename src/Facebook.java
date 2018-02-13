import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
    WebDriver Driver= new FirefoxDriver();
    /* Driver.get("http://facebook.com");
    Driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testemail");
    Driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("testpassword");
    Driver.findElement(By.xpath("//input[@type='submit']")).click();
    
    Driver.findElement(By.cssSelector("input[type='email']")).sendKeys("emailtest");
    Driver.findElement(By.cssSelector("input[type='password']")).sendKeys("test1234");
    Driver.findElement(By.xpath("//input[@type='submit']")).click();*/
    Driver.get("http://rediff.com");
    Driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
    Driver.findElement(By.cssSelector("input[name='login']")).sendKeys("testemail");
    Driver.findElement(By.cssSelector("input#password")).sendKeys("test1234");
    WebElement Checkbox=Driver.findElement(By.cssSelector("input#remember"));
    if(Checkbox.isSelected())
    {
    	Checkbox.click();
    }
    
    
	}

}
