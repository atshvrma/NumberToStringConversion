package com.numToStr.NumberToString;

import static org.junit.Assert.*;

import org.junit.Test;

import com.numToStr.NumberToStringConversion;

/**
 * Unit test for NumberString conversion.
 */
public class TestNumberToStringConversion
{
    
    @Test
    public void checkNegatives()
    {
	        String convert = NumberToStringConversion.convert(-1000);
    	    assertEquals("minus one thousand", convert);
    }
    
    @Test
    public void checkHundredThousand()
    {
    	String convert = NumberToStringConversion.convert(999999);
	    assertEquals("nine hundred ninety nine thousand nine hundred ninety nine", convert);
    }
    
    @Test
    public void checkIntMax()
    {
    	String convert = NumberToStringConversion.convert(Integer.MAX_VALUE);
	    assertEquals("Values greater than 999,999,9999 are not accepted", convert);
    }
    
    @Test
    public void checkMaxVal_NineTimes_Nine()
    {
    	String convert = NumberToStringConversion.convert(999999999);
    	System.out.println(convert);
	    assertEquals("nine hundred ninety nine million nine hundred ninety nine thousand nine hundred ninety nine", convert);
    }
}
