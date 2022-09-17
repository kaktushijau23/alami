package stepDefinitions;

import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class mainSteps {
    public static WebDriver driver = new ChromeDriver();

    @Given("^user open elevania on browser$")
    public void open_the_chrome_and_launch_the_application() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver.manage().window().maximize();
        driver.get("https://www.elevenia.co.id");

        // verify banner pop up
        try {
            mainSteps.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.id("popUpSatu")).isDisplayed();
            driver.findElement(By.className("closeBtnMainPromo")).click();
            System.out.println("banner pop up displayed");
        } catch (Exception e)
        {
            System.out.println("banner pop up not displayed");
        }
    }

    @And("^user close browser$")
    public void close_browser() {
        driver.close();
    }
}
