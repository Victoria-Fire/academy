package by.academy.homework.hw3.deal;

import java.util.regex.Pattern;

public class EmailValidator implements Validator {
	private static final Pattern p = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$");

	@Override
	public Pattern getPattern() {
		return p;
	}
}