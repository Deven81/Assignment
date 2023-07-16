package SeleniumAll;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Navigate to Home page
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(3000);

		// Click on sign up link
		driver.findElement(By.linkText("Sign In")).click();

		// Fill login details & click to login
		driver.findElement(By.id("email")).sendKeys("devendrabaviskar81@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Deven@123");
		driver.findElement(By.name("send")).click();

		// search on search box
		WebElement serach = driver.findElement(By.id("search"));
		serach.sendKeys("shirt");
		serach.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		// click on product
		WebElement addToCard = driver.findElement(By.linkText("Balboa Persistence Tee"));
		addToCard.click();
		Thread.sleep(3000);

		// add product to card
		driver.findElement(By.xpath("//div[@id='option-label-size-143-item-169']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='option-label-color-93-item-52']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='action primary tocart']")).click();
		Thread.sleep(3000);

		// open card
		driver.findElement(By.xpath("//a[@class='action showcart']")).click();
		Thread.sleep(3000);

		// change Quantity of product from 1 to 2
		WebElement UpdateProduct = driver.findElement(By.xpath("//input[starts-with(@id,'cart-item-')]"));
		UpdateProduct.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		UpdateProduct.sendKeys("2");
		Thread.sleep(3000);

		// update Quantity
		driver.findElement(By.xpath("//button[starts-with(@id,'update-cart-item-')]")).click();
		Thread.sleep(2000);

		// remove product from card

//		WebElement removeProduct = driver.findElement(By.xpath("(//a[@title='Remove item'])[1]"));
//		removeProduct.click();
//		Thread.sleep(2000);

		driver.findElement(By.cssSelector("a[title='Remove item']")).click();

		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);

		alt.accept();

	}
}
