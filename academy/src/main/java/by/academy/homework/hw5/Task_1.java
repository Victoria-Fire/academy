package by.academy.homework.hw5;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Task_1 {

	public static List<String> checkDuplicateString(List<String> list) {
		List<String> checkList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (!checkList.contains(list.get(i))) {
				checkList.add(list.get(i));
			}
		}
		return checkList;
	}

	public static List<Integer> checkDuplicateInteger(List<Integer> list) {
		Set<Integer> listSet = new LinkedHashSet<>(list);
		List<Integer> checkList = new LinkedList<>();
		checkList.addAll(listSet);
		return checkList;
	}

	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
		str.add("Жираф");
		str.add("Слон");
		str.add("Носорог");
		str.add("Жираф");
		str.add("Бегемот");
		str.add("Зебра");
		str.add("Зебра");
		str.add("Бегемот");
		str.add("Тигр");
		str.add("Зебра");

		System.out.println("Первый способ:");
		List<String> newStr1 = checkDuplicateString(str);
		for (String string : newStr1) {
			System.out.println(string);
		}

		System.out.println();

		List<Integer> number = new LinkedList<>();
		number.add(777);
		number.add(13);
		number.add(2);
		number.add(96);
		number.add(13);
		number.add(44);
		number.add(96);
		number.add(136);
		number.add(1);
		number.add(777);

		System.out.println("Второй способ:");
		List<Integer> newNumber = checkDuplicateInteger(number);
		for (Integer integer : newNumber) {
			System.out.println(integer);
		}
	}
}
