package com.fleet.Pages;

import com.fleet.Base.BaseUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;


public class LoginPage extends BaseUtils {
    private BaseUtils base;

    public LoginPage(BaseUtils base) {
        this.base = base;
    }

    @Given("^User goes to login page$")
    public void user_goes_to_login_page(){
        base.driver.navigate().to("http://v2.surefleet.com/Common/Index?ActionName=loginView");
    }

    @When("^I enter username as \"([^\"]*)\"$")
    public void i_enter_username_as(String username){
        base.driver.findElement(By.id("txtLoginId")).sendKeys(username);
    }

    @When("^I enter password as \"([^\"]*)\"$")
    public void i_enter_password_as(String password){
        base.driver.findElement(By.id("txtPassword")).sendKeys(password);
    }

    @When("^I click 'Sign In'$")
    public void i_enter_password_as(){
        base.driver.findElement(By.xpath("//input[contains(@value,'Sign In')]")).click();
    }

    @Then("^Login should fail$")
    public void login_should_fail(){
        String actualValue = base.driver.findElement(By.id("error-msg")).getText();
        Assert.assertEquals(actualValue,"Invalid login credentials.");
    }
}
