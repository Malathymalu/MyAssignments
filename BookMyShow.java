package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BookMyShow {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option= new ChromeOptions();
        option.addArguments("--disable-notifications");
        ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://in.bookmyshow.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='sc-hCaUpS cLnzvB']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//strong[text()='Hyderabad']")).click();
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		driver.findElement(By.xpath("//span[text()='Search for Movies, Events, Plays, Sports and Activities']")).click();
		driver.findElement(By.xpath("//span[text()='Tamil']")).click();
		driver.findElement(By.xpath("//a[text()='Vaathi (U)']")).click();
		String theatername = driver.findElement(By.xpath("//a[text()='Prasads Multiplex: Hyderabad']")).getText();
		System.out.println("The theater name is - " + theatername);
		Thread.sleep(1000);
		driver.findElement(By.className("venue-info-text")).click();
		String parkingFA = driver.findElement(By.xpath("//div[contains(text(),'Parking')]")).getText();
		System.out.println("Parking Facility is Available" + parkingFA);
		Thread.sleep(4000);
		WebElement closeWindow = driver.findElement(By.xpath("//div[@class='cross-container']"));
		driver.executeScript("arguments[0].click()", closeWindow);
		driver.findElement(By.xpath("//div[text()='Available']")).click();
		driver.findElement(By.xpath("//div[@class='__details']")).click();
		driver.findElement(By.xpath("(//div[text()='Accept'])[1]")).click();
		driver.findElement(By.xpath("//li[text()='1']")).click();
		driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
		WebElement selectSeat = driver.findElement(By.xpath("//a[text()='8']"));
		driver.executeScript("arguments[0].click();", selectSeat);
		WebElement pay = driver.findElement(By.id("btmcntbook"));
		driver.executeScript("arguments[0].click();", pay);
		Thread.sleep(1000);
		String subTotal = driver.findElement(By.xpath("//span[@id='subTT']")).getText();
		System.out.println(subTotal);
		
		

	}

}
