package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
	driver.findElement(By.name("firstname")).sendKeys("Malini");
	driver.findElement(By.name("lastname")).sendKeys("s");
	driver.findElement(By.name("reg_email__")).sendKeys("malathymalu04@gmail.com");
	driver.findElement(By.id("password_step_input")).sendKeys("malu@123");
	WebElement day = driver.findElement(By.id("day"));
	Select dd=new Select(day);
	dd.selectByVisibleText("17");
	WebElement month = driver.findElement(By.id("month"));
	Select dd1=new Select(month);
	dd1.selectByVisibleText("Feb");
	WebElement year = driver.findElement(By.id("year"));
	Select dd2= new Select(year);
	dd2.selectByVisibleText("2023");
	driver.findElement(By.xpath("//label[contains(text(),'Female')]/following::input")).click();
	System.out.println("I have entered b FaceBoox signup page details");
	driver.close();
	
	
	}

}
