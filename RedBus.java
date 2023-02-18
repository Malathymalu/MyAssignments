package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
        driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
        driver.findElement(By.xpath("//td[text()='17']")).click();
        driver.findElement(By.xpath("//button[@id='search_btn']")).click();
        String noOfBus = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
        System.out.println("The number of buses found - " + noOfBus);
        WebElement SlChBox = driver.findElement(By.xpath("//label[text()='SLEEPER']"));
        driver.executeScript("arguments[0].click();", SlChBox );
        Thread.sleep(2000);
        String urlname = driver.findElement(By.xpath("//div[text()='KMRL Kalaimakal']")).getText();
        System.out.println(urlname);
        String title = driver.getTitle();
        System.out.println(title);
        
        
	}

}
