import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations1 {

    @Test
    void test3(){
        System.out.println("This is test 3....");
    }

    @Test
    void test4(){
        System.out.println("This is test 4....");
    }

    @BeforeSuite
    void beforeSuite(){
        System.out.println("This will execute before Test suite...");
    }

    @AfterSuite
    void afterSuite(){
        System.out.println("This will execute after Test suite...");
    }
}
