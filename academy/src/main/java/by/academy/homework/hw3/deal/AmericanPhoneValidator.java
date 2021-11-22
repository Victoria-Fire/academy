package by.academy.homework.hw3.deal;

import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {
	private static final Pattern p = Pattern.compile("^\\+1\\d{10}$");

	@Override
	public Pattern getPattern() {
		return p;
	}	
}