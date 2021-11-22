package by.academy.classwork.lesson10;

import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {
	
	private static final Pattern p = Pattern.compile("^\\+375(25|29|33|44)\\d{7}$");
	
	@Override
	public Pattern getPattern() {	
		return p;
	}

}
