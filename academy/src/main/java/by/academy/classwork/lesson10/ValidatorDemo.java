package by.academy.classwork.lesson10;

public class ValidatorDemo {

	public static void main(String[] args) {
		AmericanPhoneValidator am = new AmericanPhoneValidator();
		System.out.println(am.isValid("+17894561237"));
		
		BelarusPhoneValidator bel = new BelarusPhoneValidator();
		System.out.println(bel.isValid("+375299898678"));

	}

}
