package stepDefinitions;

import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class searchPageSteps {

    @And("^user sort product by Produk Terlaris$")
    public void sort_product_best_seller() {
        mainSteps.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mainSteps.driver.findElement(By.xpath("//p[contains(text(),'Hasil pencarian')]")).isDisplayed();

        // click by produk terlaris
        mainSteps.driver.findElement(By.xpath("//a[@code='SS']")).click();
    }

    @And("^user click first of list product$")
    public void click_first_product() {
        mainSteps.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // add exception to cover error "element is not attached to the page document"
        try {
            mainSteps.driver.findElements(By.xpath("//a[contains(@class,'pordLink')]")).get(0).click();
        } catch (Exception e) {
            mainSteps.driver.findElements(By.xpath("//a[contains(@class,'pordLink')]")).get(0).click();
        }
    }
}
