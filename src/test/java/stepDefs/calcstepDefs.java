package stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import helpers.baseClass;
import org.openqa.selenium.By;
import pageObjects.calcPage;

import java.util.concurrent.TimeUnit;

public class calcstepDefs extends baseClass {
    calcPage calcpage;
    public String calcFirstNum; public String calcSecondNum;

    @Given("^I have two numbers \"(.*?)\" and \"(.*?)\"$")
    public void i_have_two_numbers_and(String firstNum, String secondNum) throws Throwable {
        calcFirstNum = firstNum; calcSecondNum = secondNum;

    }

    @When("^I \"(.*?)\" them$")
    public void i_them(String calcMethod) throws Throwable {
        calcpage = new calcPage();
        calcpage.doCalcMethod(calcMethod, calcFirstNum, calcSecondNum);

    }

    @Then("^the total will be \"(.*?)\"$")
    public void the_total_will_be(String total) throws Throwable {
        calcpage = new calcPage();
        calcpage.verifyTotal(total);

    }

    @Given("^I am on the calculator app$")
    public void iAmOnTheCalculatorApp()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://web2.0calc.com/");
        if (driver.findElements(By.name("cookies")).size() >0)
        {
            driver.findElement(By.name("cookies")).click();
        }
    }
}
