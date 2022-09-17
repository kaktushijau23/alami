package stepDefinitions;

import cucumber.api.java.en.*;
import org.openqa.selenium.By;


public class homePageSteps {

    @And("^user redirect to home page$")
    public void verify_home_page() {
        mainSteps.driver.findElement(By.className("btn-search")).isDisplayed();
    }

    @When("^user search product by keyword \"(.*)\"$")
    public void search_product(String keyword) {
        mainSteps.driver.findElements(By.xpath("//input[@title='Enter search word']")).get(0).sendKeys(keyword);
        mainSteps.driver.findElement(By.className("btn-search")).click();
    }
}
