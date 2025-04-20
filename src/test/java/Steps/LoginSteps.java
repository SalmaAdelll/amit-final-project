package Steps;

import Pages.login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginSteps {
    Hooks hooks=new Hooks();
    login login=new login();

    public LoginSteps() throws InterruptedException {
    }

    @Given("user navigate to automation web")
    public void user_navigate_to_automation_web(){
        hooks.Setup();
    }


    @When("user click on Signup or Login button")
    public void user_click_on_Signup_or_Login_button() throws InterruptedException {
        login.SignUp_Login_button().click();
    }


    @And("user Enter email address")
    public void user_Enter_email_address() throws InterruptedException {
        login.Email().sendKeys("salma@gmail.com");
    }
    @And("user Enter password")
    public void user_Enter_password() throws InterruptedException {
        login.pass().sendKeys("55555");
    }
    @And("user click on login button")
    public void user_click_on_login_button() throws InterruptedException {
        login.Login_button().click();
    }


    @Then("web will show error message")
    public void web_will_show_error_message() throws InterruptedException {
        String Expected="Your email or password is incorrect!";
        String Actual=login.Actual().getText();
        Assert.assertEquals(Actual,Expected);
    }


    @And("user Enter email address {string}")
    public void userEnterEmailAddress(String arg0) {
    }

    @And("user Enter password {string}")
    public void userEnterPassword(String arg0) {
    }
}
