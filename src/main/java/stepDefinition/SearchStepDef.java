package stepDefinition;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectes.SearchPageObjects;

public class SearchStepDef {

	AndroidDriver<MobileElement> driver;
	DesiredCapabilities cap;
	URL url;
	SearchPageObjects obj;

	@Given("I open the That Shopping List apllication")
	public void i_open_the_that_shopping_list_apllication() {

		System.out.println("Application started");
		cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "AOSP on IA Emulator");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("appPackage", "de.markusliebschner.thatlist");
		cap.setCapability("appActivity", "de.markusliebschner.thatlist.MainActivity");

		try {
			url = new URL("http://127.0.0.1:4723/wd/hub");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver = new AndroidDriver<MobileElement>(url, cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		obj = new SearchPageObjects(driver);
		System.out.println("Application started");
	}

	@And("Search for Tomato in the searchbox")
	public void search_for_tomato_in_the_searchbox() {
		obj.searchTomato();
		System.out.println("Tomatoes searched");
	}

	@And("I added it to the cart")
	public void i_added_it_to_the_cart() throws InterruptedException {
		obj.addTomato();
		System.out.println("Tomatoes added to cart");
	}

	@When("I eneter the amount of tomatoes to be bought")
	public void i_eneter_the_amount_of_tomatoes_to_be_bought() {
		obj.amountOfTomato();
		System.out.println("Count of Tomatoes added");
	}

	@Then("I should be able to close the application")
	public void i_should_be_able_to_close_the_application() {
		obj.closeApplication();
		System.out.println("Apllication closed sucessfully");
	}

}
