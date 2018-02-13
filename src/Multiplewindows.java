import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("https://accounts.google.com/SignUp");
		Driver.findElementByXPath("html/body/div[1]/div[2]/div/div[1]/p/a").click();
		System.out.println(Driver.getTitle());
		Set<String> ids= Driver.getWindowHandles();
		Iterator<String> It=ids.iterator();
		String ParentId= It.next();
		String ChildId= It.next();
		Driver.switchTo().window(ChildId);
		System.out.println(Driver.getTitle());
		
	}

}
