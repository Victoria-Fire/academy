package by.academy.task4_cycle;

public class Test_8 {

	public static void main(String[] args) {
		int number;
		
		for (int i = 20; i <= 50; i++) {
			number = i;
			
			if((number % 3 == 0) && (number % 5 != 0)) {
				System.out.println(number + " - это число, которое делится на 3, но не делится на 5");
			}			
		}
	}
}
