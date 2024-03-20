package GuviTask18;
		
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ans01 {

	public static void main(String[] args) throws Exception {
				// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
				driver.navigate().to("https://www.facebook.com/");
				// driver.manage().window().maximize();
				Thread.sleep(50);
				driver.findElement(By.xpath("//a[contains(.,'Create new account')]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("Mahi");
				driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("pya");
				driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("testcase07@gmail.com");
				driver.findElement(By.xpath("//input[contains(@name,'reg_email_confirmation__')]"))
						.sendKeys("testcase07@gmail.com");
				driver.findElement(By.xpath("//input[contains(@name,'reg_passwd__')]")).sendKeys("Pass@123");
				WebElement element = driver.findElement(By.id("day"));
				Select obj = new Select(element);
				obj.selectByIndex(10);
				WebElement element1 = driver.findElement(By.id("month"));
				Select obj1 = new Select(element1);
				obj1.selectByIndex(4);
				WebElement element2 = driver.findElement(By.id("year"));
				Select obj2 = new Select(element2);
				obj2.selectByValue("1994");
				driver.findElement(By.xpath(
						"/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/span[1]/span[2]/input[1]"))
						.click();
				driver.findElement(By.xpath("//button[contains(@name,'websubmit')]")).click();
	}

}
