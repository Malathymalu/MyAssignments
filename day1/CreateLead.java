package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Malathy");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Solai");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Malathy");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Tester");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("null");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("malathymalu04@gmail.com");
	WebElement stateDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
    Select dd = new Select(stateDropDown);
    dd.selectByVisibleText("New York");
    Thread.sleep(2000);
    driver.findElement(By.className("smallSubmit")).click();
    String title = driver.getTitle();
    System.out.println(title);	
}
}
