package specficTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://stqatools.com/demo/index.php");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//(//a[@class="nav-link dropdown-toggle"])[2]
		WebElement interactions = driver.findElement(By.xpath("(//a[@class=\"nav-link dropdown-toggle\"])[2]"));
		interactions.click();
		
		Thread.sleep(3000);
		////a[text()="Double Click"]
		WebElement doubleClick = driver.findElement(By.xpath("//a[text()=\"Double Click\"]"));
		doubleClick.click();
		
		Thread.sleep(3000);
		
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()=\"Click Me / Double Click Me!\"]")) ;

		Actions act= new Actions(driver);
		act.doubleClick(doubleClickButton).build().perform();
		
	}

}
