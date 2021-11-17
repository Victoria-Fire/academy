package by.academy.homework.hw3.deal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {

	@Override
	public boolean validate(String str) {
		Pattern pattern = Pattern.compile("^\\+375(25|29|33|44)\\d{7}$");
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
	

}
