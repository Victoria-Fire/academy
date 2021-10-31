package by.academy.task4_cycle;

public class Test_11 {

	public static void main(String[] args) {
		int number;
		
		for (int i = 10; i < 100; i++) {
			number = i;
			
			if((number % 4 == 0) && (number % 6 != 0)) {
				System.out.println(number + " - это число, которое делится на 4, но не делится на 6");
			}
			
		}

	}

}
