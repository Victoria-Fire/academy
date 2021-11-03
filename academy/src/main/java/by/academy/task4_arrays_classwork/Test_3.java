package by.academy.task4_arrays_classwork;

public class Test_3 {

	public static void main(String[] args) {
		char[][] array = { { 'b', 'u' }, { 'm', 'e' }, { 'n', 'c' }, { 'f', 'w' } };

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
