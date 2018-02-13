import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class Automation1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("http://spicejet.com");
		Driver.findElementByXPath("//input[@value='OneWay']").click();
		Driver.findElementByCssSelector("#ctl00_mainContent_ddl_originStation1_CTXT").click();
		Driver.findElementByXPath("//a[@value='CCU']").click();
		Driver.findElementByXPath("(//a[@value='BLR'])[2]").click();
		Select s = new Select (Driver.findElementByXPath("//select[@id='ctl00_mainContent_ddl_Adult']"));
		s.selectByIndex(2);
		
		
		
		
		
		}

}







/*System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
WebDriver driver= new FirefoxDriver();
driver.get("http://qaclickacademy.com");
System.out.println(driver.getTitle());
System.out.println(driver.getPageSource());
driver.close();*/
//GoogleChrome

/*driver1.get("http://facebook.com");
driver1.findElementById("email").sendKeys("monica.panja@gmail.com");
driver1.findElementByName("pass").sendKeys("tapugopa1991");
driver1.findElementByLinkText("Forgot account?").click();*/

/*driver1.get("http://login.salesforce.com");
driver1.findElementById("username").sendKeys("hello");
driver1.findElementByName("pw").sendKeys("123456");
driver1.findElementByClassName("button r4 wide primary").click();//Compound class names not permitted in Selenium webdriver
driver1.close();
driver1.get("http://facebook.com");
driver1.findElementByCssSelector("#email").sendKeys("hello");
driver1.findElementByXPath("//*[@id='pass']").sendKeys("123456");
driver1.findElementByCssSelector("#u_0_5");*/
   /* Driver.get("http://rediff.com");
    Driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
    Driver.findElement(By.cssSelector("input[name='login']")).sendKeys("testemail");
    Driver.findElement(By.cssSelector("input#password")).sendKeys("test1234");
    Driver.findElement(By.cssSelector("input#remember")).isSelected();
    Driver.findElement(By.cssSelector("input[title='Sign in']")).click();
Driver.get("http://qaclickacademy.com");
Driver.findElementByXPath("//*[@id='tablist1-tab1']/followingsibling::li[1]");*/