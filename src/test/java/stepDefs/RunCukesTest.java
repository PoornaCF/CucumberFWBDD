package stepDefs;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features"},
        plugin={"pretty","json:target/cucumber-report/cucumber.json"})

public class RunCukesTest {

    public static void main(String[] args) {

    }
}
