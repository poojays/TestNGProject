package test;

 

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//import com.beust.jcommander.Parameter;

 

public class ParametersEx {
    
    @Parameters({"nameparam"})
    @Test
    
    public void testcase1(String name) {
        System.out.println("HI :" +name);
    }
    

 

}