package by.academy.task4_cycle;

public class Test_9 {

	public static void main(String[] args) {
		int number;
		
		for (int i = 35; i <= 87; i++) {
			number = i;
			 
			if((number % 7 == 1) || (number % 7 == 2) || (number % 7 == 5)) {
				System.out.println(number + " - это число,  которое при делении на 7 дают остаток 1, 2 или 5");
			}
		}
	}
}
