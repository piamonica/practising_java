import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gridsandtables1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("http://www.cricbuzz.com/live-cricket-scorecard/17697/aus-vs-eng-5th-odi-england-tour-of-australia-2018");
		int sum=0;
		/*WebElement table= Driver.findElementByCssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']");
		int rowcount= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		//put a space then tagname:n-th-child(i)
		int count= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size(); 	*/
		
		WebElement table=Driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowcount= table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
		int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for(int i=0;i<count-2;i++)
		{
			String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int integervalue=Integer.parseInt(value);
			sum=sum+integervalue;
			
		}
        //System.out.println(sum);
		String Extras=Driver.findElementByXPath("//div[text()='Extras']/following-sibling::div").getText();
		int Extravalue=Integer.parseInt(Extras);
		int Total=sum+Extravalue;
		System.out.println(Total);
		String ActualTotal=Driver.findElementByXPath("//div[text()='Total']/following-sibling::div").getText();
		int Actualtotalvalue=Integer.parseInt(ActualTotal);
		if (Total==Actualtotalvalue)
		{
			System.out.println("Match Found");
		}
		else
		{
			System.out.println("Mismatch");
		}
	}

}
