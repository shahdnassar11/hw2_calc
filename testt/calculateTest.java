package calculate1;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import calculate1.calculate;

public class calculateTest{
	@Before
    public void setUp() {
		calculate calc = new calculate();
    }

   
    @Test
    public void testAdd() {
        int a = 15;
        int b = 20;
        int expectedResult = 35;
        long result = calculate.add(a, b);
        Assert.assertEquals(expectedResult, result);;
    }
    @Test
    public void testSubtract() {
        int a = 25;
        int b = 20;
        int expectedResult = 5;
        long result = calculate.sub(a, b);
        Assert.assertEquals(expectedResult, result);;
    }
    @Test
    public void testMultiply() {
        int a = 10;
        int b = 25;
        long expectedResult = 250;
        long result = calculate.mult(a, b);
        Assert.assertEquals(expectedResult, result);;
    }
  
    
    
    	
		
	}

