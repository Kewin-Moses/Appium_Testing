package pageObjectes;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SearchPageObjects {

	// Driver Intialise
	private AndroidDriver<MobileElement> driver;

	// constructor
	public SearchPageObjects(AndroidDriver<MobileElement> driver) {

		this.driver = driver;
	}

	public void searchTomato() {
		MobileElement searchBox = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"searchIpt\"]"));
		searchBox.sendKeys("Tomato");

		MobileElement add = driver.findElement(By.xpath("(//android.view.View[@text=\"add\"])[4]"));
		add.click();

	}

	public void addTomato() throws InterruptedException {

		Thread.sleep(3000);

		MobileElement cart = driver
				.findElement(By.xpath("//android.widget.ListView/android.view.View/android.view.View[2]"));
		cart.click();

		MobileElement settings = driver.findElement(By.xpath("(//android.view.View[@text=\"settings\"])[2]"));
		settings.click();

	}

	public void amountOfTomato() {
		MobileElement amount = driver.findElement(By.xpath(
				"//android.view.View[@resource-id=\"main-view\"]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.ListView/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText"));
		amount.sendKeys("10");

		MobileElement Done = driver.findElement(By.xpath("(//android.view.View[@text=\"check\"])[2]"));
		Done.click();

	}

	public void closeApplication() {

		driver.quit();

	}

}
