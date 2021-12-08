package by.academy.homework.hw5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task_2 {
	public static void addElements(List<Integer> list) {
		for (int i = 0; i < 1_000_000; i++) {
			list.add(i + 1);
		}
	}

	public static void getElements(List<Integer> list) {
		Random random = new Random();
		for (int i = 0; i < 100_000; i++) {
			list.get(random.nextInt(list.size()));
		}
	}

	public static void getTimeAddElements(List<Integer> list) {
		long start = System.currentTimeMillis();
		addElements(list);
		long end = System.currentTimeMillis();
		long diff = end - start;
		System.out.println("Время выполнения: " + diff);
	}

	public static void getTimeGetElements(List<Integer> list) {
		long start = System.currentTimeMillis();
		getElements(list);
		long end = System.currentTimeMillis();
		long diff = end - start;
		System.out.println("Время выполнения: " + diff);
	}

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

		addElements(arrayList);
		addElements(linkedList);

		System.out.println("Для arrayList - добавление элемента");
		getTimeAddElements(arrayList);
		System.out.println();
		System.out.println("Для linkedList - добавление элемента");
		getTimeAddElements(linkedList);

		System.out.println();

		System.out.println("Для arrayList - взятие элемента по индексу");
		getTimeGetElements(arrayList);
		System.out.println();
		System.out.println("Для linkedList - взятие элемента по индексу");
		getTimeGetElements(linkedList);
	}
}

// LinkedList - это связанный ссылками список, где взятие элемента по индексу производятся
// перебором с начала или с конца до нужного элемента. В ArrayList - взятие элемента по индексу
// выполняется за константное время. Здесь LinkedList проигрывает ArrayList-у.
