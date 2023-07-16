package SeleniumAll;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

// this is 2nd program i tried on other web site this program is fully completed
// login to add & remove product and logout 
public class SauceWebDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000);
		
		// Enter Id Password And log in
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		// Select Dropdown for Price low to high
		WebElement list=driver.findElement(By.className("product_sort_container"));
		
		Select dropdown=new Select(list);
		
		dropdown.selectByValue("lohi");
		Thread.sleep(2000);
		
		// Add product 1 by 1
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(2000);
		
		// Click on Card Button
		driver.findElement(By.className("shopping_cart_badge")).click();
		Thread.sleep(2000);
    		
		// Remove One Item from card
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		Thread.sleep(2000);   
		
		// click on check out
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		
		// add some info
		driver.findElement(By.id("first-name")).sendKeys("Devendra");
		
		driver.findElement(By.id("last-name")).sendKeys("baviskar");

		driver.findElement(By.id("postal-code")).sendKeys("411051");
		Thread.sleep(2000);

		// click to continue button
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);

		// click to finish button
		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);
		
		// open menu for log out
		WebElement getlist=driver.findElement(By.xpath("//button[text()='Open Menu']"));
		getlist.click();
		Thread.sleep(2000);
		
		
		List<WebElement>listOfOption=getlist.findElements(By.className("bm-item-list"));
		Thread.sleep(2000);
		
		// And logout button
        WebElement logoutText=driver.findElement(By.id("logout_sidebar_link"));
        System.out.println("text is:"+logoutText.getText());
        logoutText.click();
        Thread.sleep(2000);
        
        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.close();
		

	}

}
