package by.academy.classwork.lesson10;

import java.util.regex.Pattern;

public interface Validator {
	
	Pattern getPattern();
	
	default boolean isValid(String s) {
		return getPattern().matcher(s).matches();
	}
}
