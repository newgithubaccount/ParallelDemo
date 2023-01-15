package testing.com.ParaleleDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelDemo {
	WebDriver driver;
	@Test
	public void FirefoxTest() throws InterruptedException {
		// Initializing the firefox driver (Gecko)
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle()+"--firefox");
		Thread.sleep(20000);
		driver.quit();
	}

	@Test
	public void ChromeTest() throws InterruptedException {
		// Initialize the chrome driver
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle()+"--chrome");
		Thread.sleep(20000);
		driver.quit();
	}

	@Test
	public void ChromeTest1() throws InterruptedException {
		// Initialize the chrome driver
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle()+"--chrome");
		Thread.sleep(20000);
		driver.quit();
	}

	@Test
	public void ChromeTest2() throws InterruptedException {
		// Initialize the chrome driver
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle()+"--chrome");
		Thread.sleep(20000);
		driver.quit();
	}

	@Test
	public void ChromeTest3() throws InterruptedException {
		// Initialize the chrome driver
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle()+"--chrome");
		Thread.sleep(20000);
		driver.quit();
	}

	@Test
	public void ChromeTest4() throws InterruptedException {
		// Initialize the chrome driver
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle()+"--chrome");
		Thread.sleep(20000);
		driver.quit();
	}

}
