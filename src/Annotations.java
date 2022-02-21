import org.testng.annotations.*;

public class Annotations {

    @BeforeMethod
    void beforeMethod(){
        System.out.println(" This will execute before every Method");
        System.out.println("Learning GIT");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("This will execute after every method...");
    }

    @Test
    void test1(){
        System.out.println("This is test 1....");
    }

    @Test
    void test2(){
        System.out.println("This is test 2....");
    }

    @BeforeClass
    void beforeClass(){
        System.out.println("This will execute before the class..");
    }

    @AfterClass
    void afterClass(){
        System.out.println("This will execute after class...");
    }

}
