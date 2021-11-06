package by.academy.task4_arrays_classwork;

public class Test_4 {

	public static void main(String[] args) {
		int[][] array = {
				{ 2, 5, -7, 65, -43, 67, -54, 65 },
				{ 54, -76, -5, 86, 777, -43, 24, 5 },
				{ -999, 5, 54, 786, 987, -43, 37, 54 },
				{ 65, -84, -3, 23, 4, 51, 54, -123 },
				{ 33, 44, 65, -2, 1, 4, -6, -8 }
				};
		
		int[][] arrayTwo = new int [5][2];
		
		for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
				if(array[0][j] >= arrayTwo[0][0]) {
					arrayTwo[0][0] = array[0][j];
				}
				if(array[1][j] >= arrayTwo[1][0]) {
					arrayTwo[1][0] = array[1][j];
				}
				if(array[2][j] >= arrayTwo[2][0]) {
					arrayTwo[2][0] = array[2][j];
				}
				if(array[3][j] >= arrayTwo[3][0]) {
					arrayTwo[3][0] = array[3][j];
				}
				if(array[4][j] >= arrayTwo[4][0]) {
					arrayTwo[4][0] = array[4][j];
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
					if(array[0][j] <= arrayTwo[0][1]) {
						arrayTwo[0][1] = array[0][j];
					}
					if(array[1][j] <= arrayTwo[1][1]) {
						arrayTwo[1][1] = array[1][j];
					}
					if(array[2][j] <= arrayTwo[2][1]) {
						arrayTwo[2][1] = array[2][j];
					}
					if(array[3][j] <= arrayTwo[3][1]) {
						arrayTwo[3][1] = array[3][j];
					}
					if(array[4][j] <= arrayTwo[4][1]) {
						arrayTwo[4][1] = array[4][j];
					}
				}
			}
		
		System.out.println("Начальный массив:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Измененный массив с max и min значениями:");
		for (int i = 0; i < arrayTwo.length; i++) {
			for (int j = 0; j < arrayTwo[i].length; j++) {
				System.out.print(arrayTwo[i][j] + " ");
			}
			System.out.println();
		}

	}

}