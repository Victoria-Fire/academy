package by.academy.task5_strings_classwork;

public class Test_2 {

	public static void main(String[] args) {
//		а) Дано два числа, например 3 и 56, необходимо составить следующие строки: 
//			3 + 56 = 59 
//			3 – 56 = -53 
//			3 * 56 = 168. 
//			Используем метод StringBuilder.append().
		int a = 3;
		int b = 56;

		StringBuilder result1 = new StringBuilder();
		result1.append(a).append(" + ").append(b).append(" = ").append(a + b);
		System.out.println(result1);
		StringBuilder result2 = new StringBuilder();
		result2.append(a).append(" - ").append(b).append(" = ").append(a - b);
		System.out.println(result2);
		StringBuilder result3 = new StringBuilder();
		result3.append(a + " * " + b + " = " + (a * b));
		System.out.println(result3);
		System.out.println();

//		б) Замените символ “=” на слово “равно”. 
//		Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt(). 
		result1.deleteCharAt(7);
		result1.insert(7, "равно");
		System.out.println(result1);

//		в) Замените символ “=” на слово “равно”. 
//		Используйте методы StringBuilder.replace().
		result2.replace(7, 8, "равно");
		System.out.println(result2);
	}
}
