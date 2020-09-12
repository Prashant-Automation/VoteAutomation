package com.vote.test.scenarios.test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test
public class VoteForMrudul {

	public void testVote() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/src/test/resources/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://mycutebaby.in/contest/participant/?n=5f549d64d60ed");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='v']")).sendKeys("Mrudul Groups");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Tap To Vote')]")).click();
		System.out.println("Vote Done");
		driver.close();
	}

}
