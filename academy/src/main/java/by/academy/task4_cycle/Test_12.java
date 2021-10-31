package by.academy.task4_cycle;

public class Test_12 {

	public static void main(String[] args) {
		int number;
		int result = 1;
		
		for (int i = 10; i < 100; i++) {
			number = i;
			
			if((number % 2 == 1) && (number % 13 == 0)) {
				result = result * number;
			}	
			
		}
		
		System.out.println("Произведение равно: " + result);

	}

}