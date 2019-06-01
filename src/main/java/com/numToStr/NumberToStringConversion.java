package com.numToStr;

import com.numToStr.dto.NumberStringConstants;

/**
 * Class to generate string values for any integer 
 * convert() method works recursively
 *  
 * @author atishverma
 *
 */
public class NumberToStringConversion {

	 public static String convert(final int n) {
	        if (n < 0) {
	            return "minus " + convert(-n);
	        }

	        if (n < 20) {
	            return NumberStringConstants.units[n];
	        }

	        if (n < 100) {
	            return NumberStringConstants.tens_power[n / 10] + ((n % 10 != 0) ? " " : "") + NumberStringConstants.units[n % 10];
	        }

	        if (n < 1000) {
	            return NumberStringConstants.units[n / 100] + " hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
	        }

	        if (n < 1000000) {
	            return convert(n / 1000) + " thousand" + ((n % 1000 != 0) ? " " : "") + convert(n % 1000);
	        }

	        if (n < 1000000000) {
	            return convert(n / 1000000) + " million" + ((n % 1000000 != 0) ? " " : "") + convert(n % 1000000);
	        }

	        return "Values greater than 999,999,9999 are not accepted";
	    }
	
}
