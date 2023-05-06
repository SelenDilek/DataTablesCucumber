package StepDefinitions ;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.Map;

@RunWith(Cucumber.class)
public class Stepdefinitions {
    WebDriver driver;


    /*public void setup(){

        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver = new ChromeDriver();
        System.out.println("Continue..");
        driver.get("https://www.google.com/");

    }*/

    @Before
    public void setUp2(){

        System.out.println("Something");


    }
    @BeforeTest
    public void deneme1(){

        System.out.println(">>>This is a before test>>>");
    }

    @AfterTest

    public void deneme2(){

        System.out.println(">>>This is a after test>>>");
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Given("^User navigate to Register Account Page$")
    public void user_navigate_to_register_account_page() throws Throwable {
        System.out.println("Success entered");
    }

    @When("^User enters below details into the fields$")
    public void user_enters_below_details_into_the_fields(DataTable table) throws Throwable {
        System.out.println("Datatable is finished!!");

        Map<String,String> map =table.asMap(String.class , String.class);
        System.out.println("Firstname : " + map.get("firstname"));
        System.out.println("Lastname : " + map.get("lastname"));
        System.out.println("Address : " + map.get("adress"));
        System.out.println("Telephone : " + map.get("telephone"));
        System.out.println("Password : " + map.get("password"));

    }

    @When("^User enters enters firstname \"([^\"]*)\"$")
    public void user_enters_enters_firstname_something(String firstname) throws Throwable {
        System.out.println("Firstname is : " + firstname);
    }

    @Then("^Account should get successfully created$")
    public void account_should_get_successfully_created(Scenario scenario) throws Throwable {
        System.out.println("User account created ");
        if(scenario.isFailed()){
            try {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                String testName = scenario.getName();
                scenario.embed(screenshot, "image/png");
                scenario.write(testName);
            } catch (WebDriverException wde) {
                System.err.println(wde.getMessage());
            } catch (ClassCastException cce) {
                cce.printStackTrace();}
        }
    }


    @And("^Select privacy Policy field$")
    public void select_privacy_policy_field() throws Throwable {
        System.out.println("Privacy selected");
    }

    @And("^Clicks on the Continue button$")
    public void clicks_on_the_continue_button() throws Throwable {
        System.out.println("User clicked on the button");
    }

    @And("^Enters lastname \"([^\"]*)\"$")
    public void enters_lastname_something(String lastname) throws Throwable {
        System.out.println("Lastname is : " + lastname);
    }

    @And("^Enters enailadsress \"([^\"]*)\"$")
    public void enters_enailadsress_something(String email) throws Throwable {
        System.out.println("Emailis : " + email);
    }

    @And("^Enters telephone \"([^\"]*)\"$")
    public void enters_telephone_something(String phone) throws Throwable {
        System.out.println("Phone  : " + phone);
    }

    @And("^Enters password \"([^\"]*)\"$")
    public void enters_password_something(String pass) throws Throwable {
        System.out.println("Password  : " + pass);
    }

}