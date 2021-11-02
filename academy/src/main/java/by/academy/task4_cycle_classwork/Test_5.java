package by.academy.task4_cycle_classwork;

public class Test_5 {

	public static void main(String[] args) {
		int number = 0;
		
		do {
			number++;
			if(number % 5 == 0) {
				System.out.println(number);
			}
			
		} while ((number > 0) && (number <=100));

	}

}