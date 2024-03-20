package GuviTask18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ans02 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();// Step1
		driver.navigate().to("https://jqueryui.com/droppable/");// step2
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(10);

		// driver.switchTo().frame(0);
		WebElement fr = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(fr);
		WebElement drag = driver.findElement(By.xpath(" //div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//body/div[contains(@id,'droppable')]"));

		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
		String x = drop.getCssValue("background-color");
		System.out.println(x);
		if (x.equals("rgba(255, 250, 144, 1)")) {
			System.out.println("Dropped is Successful");
		} else {
			System.out.println("Dropped is Failed");
		}

		String actualText = driver.findElement(By.xpath(" //p[normalize-space()='Dropped!']")).getText();
		String expectedText = "Dropped!";

		if (actualText.equalsIgnoreCase(expectedText)) {
			System.out.println("Dropped is Successful");
		} else {
			System.out.println("Dropped is Failed");
		}

	}

}
