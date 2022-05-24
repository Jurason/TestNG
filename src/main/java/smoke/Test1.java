package smoke;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {

    @Parameters({"Parametr1"})
    @Test (groups = {"SmokeTest"})
    public void test1 (String Parametr1) {
        System.out.print("test1" + Parametr1);
    }

    @Test (groups = {"Regression"})
    public void test11 () {
        System.out.print("test11");
    }

    @Test (groups = {"Regression"})
    public void test111 () {
        System.out.print("test111");
    }
    
}
