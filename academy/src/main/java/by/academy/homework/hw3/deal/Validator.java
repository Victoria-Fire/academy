package by.academy.homework.hw3.deal;

import java.util.regex.Pattern;

public interface Validator {
	Pattern getPattern();

	default boolean isValid(String s) {
		return getPattern().matcher(s).matches();
	}
}