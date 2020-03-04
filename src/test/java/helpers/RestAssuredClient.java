package helpers;

import pojoObjects.Employee;
import java.io.IOException;
import static io.restassured.RestAssured.get;

public class RestAssuredClient
{
    public Employee getEmployeeById(String empId) throws IOException
    {
        Employee employee = get("https://jsonplaceholder.typicode.com/users/" + empId).as(Employee.class);

        return employee;
    }
}
