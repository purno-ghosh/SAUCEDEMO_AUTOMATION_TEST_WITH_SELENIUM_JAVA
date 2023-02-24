package Login_Page_Testing;
import Hepling_File.Page_Setup;
import Hepling_File.Utils;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
public class Login_Runner extends Page_Setup {
    Login object;
    Utils utils;
    @Test(enabled = true, priority = 0)
    public void Login_With_valid() throws IOException, ParseException, InterruptedException {
        driver.get("https://www.saucedemo.com/");
        object = new Login(driver);
        utils = new Utils(driver);
        utils.readJSONArray(0);
        String nn = object.Login_With_valid(utils.getUsername(), utils.getPassword());
        Assert.assertEquals(nn, "PRODUCTS");
        System.out.println("Assertion Done ! Result::> " + nn);
    }
    @Test(enabled = true, priority = 1)
    public void Login_With_Wrong() throws IOException, ParseException, InterruptedException {
        driver.get("https://www.saucedemo.com/");
        object = new Login(driver);
        utils = new Utils(driver);
        utils.readJSONArray(1);
        String nn1 = object.Login_With_Wrong(utils.getUsername(), utils.getPassword());
        Assert.assertEquals(nn1, "Epic sadface: Username and password do not match any user in this service");
        System.out.println("Assertion Done ! Result::> " + nn1);
    }
}
