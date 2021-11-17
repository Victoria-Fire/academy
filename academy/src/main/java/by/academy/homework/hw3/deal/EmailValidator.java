package by.academy.homework.hw3.deal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {

	@Override
	public boolean validate(String str) {
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$");
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}

	
}
