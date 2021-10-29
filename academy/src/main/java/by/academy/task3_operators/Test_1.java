package by.academy.task3_operators;

public class Test_1 {

	public static void main(String[] args) {
		int a = 2_123_000;
		int b = 100;
		int c = 234;
		int result = a / b * c;
		System.out.println("Ответ: "+ result);
		System.out.println();
		String textResult = Integer.toString(result);
		String myResult = "Красивый ответ: " + textResult.substring(0, 1) + "_" + textResult.substring(1, 4) + "_" + textResult.substring(4, 7);
		
		System.out.println(myResult);

	}

}
