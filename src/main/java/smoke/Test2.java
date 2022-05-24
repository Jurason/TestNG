package smoke;

import org.testng.annotations.Test;

public class Test2 {

    @Test (groups = {"SmokeTest"})
    public void test2 () {System.out.print("test2");}

    @Test (groups = {"Regression"})
    public void test22 () {
        System.out.print("test22");
    }

    @Test (groups = {"Regression"})
    public void test222 () {
        System.out.print("test222");}

}
