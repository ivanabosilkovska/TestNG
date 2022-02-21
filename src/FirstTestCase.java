import org.testng.annotations.Test;

public class FirstTestCase {

    // setup
    @Test(priority = 1)
    void setup(){
        System.out.println("Opening browser...");
    }

    // login
    @Test(priority = 2)
    void login(){
        System.out.println("This is logging test...");
    }

    //teardown
    @Test (priority = 3, enabled = false)
    void teardown(){
        System.out.println("Closing browser...");
    }
}
