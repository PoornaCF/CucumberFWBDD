package stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import helpers.RestAssuredClient;
import helpers.baseClass;

import pojoObjects.Employee;
import org.junit.Assert;

public class EmployeeStepDefs extends baseClass
{
    private Employee employee;
    @Given("^I look for employee id (.*)$")
    public void ILookForEmployeeId(String empId) throws Throwable
    {
        RestAssuredClient restAssuredClient = new RestAssuredClient();
        employee = restAssuredClient.getEmployeeById(empId);
    }

    @Then("^I can verify the employee city is (.*)$")
    public void iCanVerifyTheEmployeeCityIs(String city)
    {
        Assert.assertTrue(employee.getAddress().getCity().equals(city));
    }
}
