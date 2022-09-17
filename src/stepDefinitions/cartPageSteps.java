package stepDefinitions;

import cucumber.api.java.en.*;
import org.openqa.selenium.By;

public class cartPageSteps {

    @And("^user redirect to cart page$")
    public void verify_cart_page() {
        mainSteps.driver.findElement(By.className("stepCon")).isDisplayed();
    }

    @Then("^user will view quantity is \"(.*)\" on cart page$")
    public void verify_quantity(String quantity) {
        mainSteps.driver.findElement(By.className("cart_input0"+ quantity)).isDisplayed();
    }

    @And("^user want to change courier$")
    public void change_courier() {
        mainSteps.driver.findElement(By.xpath("//*[@name='deliveryChangePopup']")).click();
        mainSteps.driver.switchTo().frame("ifrLayer");
        mainSteps.driver.findElement(By.xpath("//a[text()='Batal']")).click();
        mainSteps.driver.switchTo().defaultContent();
    }

    @And("^user delete cart$")
    public void delete_cart() {
        mainSteps.driver.findElements(By.xpath("//a[text()='Hapus']")).get(0).click();
        //mainSteps.driver.switchTo().frame("ifrLayer");
        mainSteps.driver.findElement(By.id("chkDelPopY")).click();
        //mainSteps.driver.switchTo().defaultContent();
    }

    @And("^product will deleted$")
    public void verify_deleted_product() {
        mainSteps.driver.findElement(By.xpath("//strong[text()='Tidak ada produk di Shopping Cart.']")).isDisplayed();
    }
}
