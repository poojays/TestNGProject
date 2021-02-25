package test;

 

import org.testng.annotations.Test;

 

public class Groups {
    
    @Test(groups= {"Regression", "Sanity"})
    public void method1() {
        System.out.println("method1 is executed");
    }
    @Test(groups= {"Sanity"})
    public void method2() {
        System.out.println("method2 is executed");
    }
    @Test(groups= {"Regression"})
    public void method3() {
        System.out.println("method3 is executed");
    }
}