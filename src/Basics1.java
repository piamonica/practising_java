import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("I started learning Java");
		Methods m= new Methods();
		System.out.println(m.ValidateHeader());
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
	}

}
