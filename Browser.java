package Selenium;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Browser {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.get("https://www.makemytrip.com/");

		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-cy='outsideModal']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));

		Thread.sleep(1000);

		source.clear();
		source.click();
		

		Thread.sleep(1000);

		source.sendKeys("MUM");

		Thread.sleep(1000);

		source.sendKeys(Keys.ARROW_DOWN);

		source.sendKeys(Keys.ENTER);

		source = driver.findElement(By.xpath("//input[@placeholder='To']"));

		Thread.sleep(1000);

		source.click();

		Thread.sleep(1000);

		source.sendKeys("DEL");

		Thread.sleep(1000);

		for(int i=1;i<3;i++)

		{

		source.sendKeys(Keys.ARROW_DOWN);

		}

		source.sendKeys(Keys.ENTER);
		//from city
		//driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();
		//to city
		//driver.findElement(By.xpath("(//li[@id='react-autowhatever-1-section-1-item-3'])[2]")).click();
		//date picker
		driver.findElement(By.xpath("//div[@class='dateInnerCell']")).click();

  //click on search box
  driver.findElement(By.xpath("//a[@class='primaryBtn.font24.latoBold.widgetSearchBtn ']")).click();
  Thread.sleep(3000);
 //click on view prices
  driver.findElement(By.xpath("//button[@class='button.actionBtn']")).click();
  driver.findElement(By.xpath("//button[@id='bookbutton-RKEY:5fb40e7a-9dc8-4887-b37a-debd7232de0f:38_0']")).click();
  //click on Booknow button
  driver.findElement(By.xpath("(//button[@id='bookbutton-RKEY:5fb40e7a-9dc8-4887-b37a-debd7232de0f:38_0'])[2]")).click();
  System.out.println(driver.getTitle());
	Set<String>ids=driver.getWindowHandles();
	Iterator<String>it=ids.iterator();
  String parentid=it.next();
  String childid=it.next();
  driver.switchTo().window(childid);
  System.out.println(driver.getTitle());
  System.out.println(driver.findElement(By.xpath("//div[@class='make_flex hrtlCenter spaceBetween']")).getText());
  System.out.println(driver.findElement(By.xpath("//div[@class='fareSmry-sctn reqPad-fareSmry-sctn']")).getText());
  driver.close();




	}

}
