package Order;
import Hepling_File.Page_Setup;
import Hepling_File.Utils;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

public class Process_Runner extends Page_Setup {
    Order_Process object1;
    Utils utils;
    @Test(enabled = true, priority = 0)
    public void Purchase_Backpack() throws IOException, ParseException, InterruptedException {
        driver.get("https://www.saucedemo.com/");
        object1 = new Order_Process(driver);
        utils = new Utils(driver);
        utils.readJSONArray(0);
        String nn3 = object1.Purchase_Backpack(utils.getUsername(), utils.getPassword());
        Assert.assertEquals(nn3, "THANK YOU FOR YOUR ORDER");
        System.out.println("Assertion Done ! Result::> " + nn3);
    }
}
