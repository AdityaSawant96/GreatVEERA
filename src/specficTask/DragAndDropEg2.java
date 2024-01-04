package specficTask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropEg2 {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("window.scrollBy(0,200)");
		//Thread.sleep(2000);
		WebElement xyz = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(xyz); 
		Thread.sleep(2000);
		
		WebElement src = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		
		
		WebElement des = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		
		Actions act = new Actions(driver);
		
		Thread.sleep(3000);
		
		act.dragAndDrop(src, des).build().perform();

	}

}
