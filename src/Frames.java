import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("https://jqueryui.com/droppable/");
		Driver.switchTo().frame(Driver.findElementByCssSelector("iframe[class='demo-frame']"));
		Driver.findElementById("draggable").click();
		Actions a = new Actions(Driver);
		WebElement source= Driver.findElementById("draggable");
		WebElement target=Driver.findElementById("droppable");
		a.dragAndDrop(source, target).build().perform();
		//how to switch back to main window outside the frame
		Driver.switchTo().defaultContent();
	}
	
}
	
	
	
	
	
