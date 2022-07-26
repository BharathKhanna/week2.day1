package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Spectromax");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Samanyu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Reddy");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sam");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Senior Tester");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sam@gmail.com");
		WebElement createLeadForm_generalStateProvinceGeoId = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select = new Select(createLeadForm_generalStateProvinceGeoId);
		select.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.getTitle();


	}

}
