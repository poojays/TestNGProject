package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

 

public class TestCase1 {
    
    @BeforeMethod
    public void  beforemethod(){
        System.out.println("before method is executed");
        
    }
    
    @Test
    public void method1() {
        System.out.println("method1 is executed");
    }
    @Test
    public void method2() {
        System.out.println("method2 is executed");
    }
    
    @AfterMethod
    public void  aftermethod(){
        System.out.println("before method is executed");
        
    }
}