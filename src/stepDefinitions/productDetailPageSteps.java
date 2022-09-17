package stepDefinitions;

import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class productDetailPageSteps {

    @And("^user redirect to product detail page$")
    public void verify_product_detail_page() {
        mainSteps.driver.findElement(By.xpath("//a[text()='Tambahkan ke Cart']")).isDisplayed();
    }

    @And("^user fill quantity is \"(.*)\"$")
    public void fill_quantity(String quantity) {
        mainSteps.driver.findElement(By.xpath("//input[@name='optionStock']")).clear();
        mainSteps.driver.findElement(By.xpath("//input[@name='optionStock']")).sendKeys(quantity);
    }

    @And("^user add product to cart$")
    public void add_to_cart() {
        mainSteps.driver.findElement(By.xpath("//a[text()='Tambahkan ke Cart']")).click();

        // handle pop up cart
        try {
            // click Ya want to view cart
            mainSteps.driver.findElement(By.className("popCart1")).isDisplayed();
            mainSteps.driver.findElements(By.className("btnRed")).get(0).click();
        } catch (Exception e)
        {
            // if there is no pop up, then direct click menu cart
            mainSteps.driver.findElement(By.xpath("//a[@title='Cart']")).click();
        }
    }
}
