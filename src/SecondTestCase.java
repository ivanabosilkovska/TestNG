import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {

    @Test(priority = 1)
    void setup(){
        System.out.println("Opening browser");
    }

    @Test(priority = 2)
    void addCustomer(){
        System.out.println("This is adding customer test");
    }

    @Test (priority = 3)
    void searchCustomer(){
        System.out.println("This is searching customer");
        Assert.assertEquals(1,2);
    }

    @Test(priority = 4)
    void teardown(){
        System.out.println("Closing Browser");
    }


}
