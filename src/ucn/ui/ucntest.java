package ucn.ui;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import path.read;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class ucntest {
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://test.customer.ucnscm.cn/#/login");
		//等待直到出现输入框的frame
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("iframe")));
		WebElement loginFrame = driver.findElement(By.className("iframe"));
		//输入用户名密码并登陆
		driver.switchTo().frame(loginFrame);
		driver.findElement(By.className("username")).clear();
		driver.findElement(By.className("username")).sendKeys(read.readEmail(0));
		driver.findElement(By.className("password")).clear();
		driver.findElement(By.className("password")).sendKeys(read.readPassWord(0));
		//等待知道login按钮能够被点击
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class=\"el-button el-button--primary el-button--medium\"]")));
		driver.findElement(By.xpath("//button[@class=\"el-button el-button--primary el-button--medium\"]")).click();
		driver.switchTo().defaultContent();
		//点击logistic按钮
//		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='el-menu-demo el-menu--horizontal el-menu']/li[8]")));
		//鼠标悬停(出现错误换成点击出现下级菜单)
//		Actions action = new Actions(driver);
		driver.findElement(By.xpath("//ul[@class='el-menu-demo el-menu--horizontal el-menu']/li[8]")).click();
		Thread.sleep(1000);
		//点击logistic plan overview
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Logistics Plan Overview')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Logistics Plan Overview')]")).click();
		//点击Place logistic plan
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='fn btn']/div[1]/button[2]/span")));
		driver.findElement(By.xpath("//div[@class='fn btn']/div[1]/button[2]/span")).click();
		//等待place plan页面加载完成
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Place New Logistic Plan')]")));
		List<WebElement> dates = driver.findElements(By.xpath("//input[@class='el-input__inner' and @placeholder='选择日期']"));
		System.out.println(dates);
		//给每个日期输入框输入日期
		for(int i =0; i< dates.size();i++) {
			dates.get(i).clear();
			dates.get(i).sendKeys("2018-7-25");
			driver.findElement(By.xpath("//span[contains(text(),'Quick Link')]")).click();
		}
		//给每个下拉框输入框输入内容
		Thread.sleep(5000);
		driver.close();
	}
}
