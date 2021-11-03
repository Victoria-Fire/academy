package by.academy.task4_arrays_classwork;

public class Test_2 {

	public static void main(String[] args) {
		String[][] array = new String[3][6];
		char letter = 'a';

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == 0) {
					array[i][j] = "a" + (j + 1);
				} else if (i == 1) {
					array[i][j] = "b" + (j + 1);
				} else if (i == 2) {
					array[i][j] = "c" + (j + 1);
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
