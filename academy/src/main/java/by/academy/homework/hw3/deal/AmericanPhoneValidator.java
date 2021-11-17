package by.academy.homework.hw3.deal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {

	@Override
	public boolean validate(String str) {
		Pattern pattern = Pattern.compile("^\\+1\\d{10}$");
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
	
	

}
