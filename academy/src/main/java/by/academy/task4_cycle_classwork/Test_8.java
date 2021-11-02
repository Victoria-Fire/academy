package by.academy.task4_cycle_classwork;

public class Test_8 {

	public static void main(String[] args) {		
		int count = (int) (Math.random() * 10);
		int number = 1;
		
		for (int i = 1; i <= count; i++) {
			number *= i;
		}

		System.out.println(count + "! равен: " + number);
		
	}

}