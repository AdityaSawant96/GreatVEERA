package specficTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.get("https://stqatools.com/demo/index.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@id=\"navbarDropdownPortfolio\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Double Click\"]")).click();
		Actions s = new Actions(driver);
		WebElement ak = driver.findElement(By.xpath("//button[text()=\"Click Me / Double Click Me!\"]"));
		Thread.sleep(3000);
		s.doubleClick(ak).build().perform();
		Thread.sleep(3000);
		s.contextClick(ak).build().perform();
		driver.quit();
	}
}