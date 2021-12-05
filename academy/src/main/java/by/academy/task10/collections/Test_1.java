package by.academy.task10.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Test_1 {

	public static void main(String[] args) {
		ArrayList<HeavyBox> box = new ArrayList<>();
		box.add(new HeavyBox(9, 8, 13, 2));
		box.add(new HeavyBox(78, 4, 17, 23));
		box.add(new HeavyBox(99, 14, 16, 33));
		box.add(new HeavyBox(7, 45, 51, 2));
		box.add(new HeavyBox(6, 8, 11, 9));

		System.out.println("б) Раcпечатать его содержимое используя for each");
		for (int i = 0; i < box.size(); i++) {
			System.out.println(box.get(i));
		}
		System.out.println();

		System.out.println("в) Изменить вес первого ящика на 1");
		box.get(0).setWeight(1);

		for (int i = 0; i < box.size(); i++) {
			System.out.println(box.get(i));
		}
		System.out.println();

		System.out.println("г) Удалить последний ящик");
		box.remove(box.size() - 1);

		for (int i = 0; i < box.size(); i++) {
			System.out.println(box.get(i));
		}
		System.out.println();

		System.out.println("д) Получить массив содержащий ящики из коллекции двумя способами и вывести на консоль");
		System.out.println("Первый способ:");
		Object[] str1 = box.toArray();
		System.out.println(Arrays.toString(str1));

		System.out.println();
		System.out.println("Второй способ:");

		HeavyBox[] str2 = new HeavyBox[box.size() - 1];
		System.out.println(Arrays.toString(box.toArray(str2)));
		System.out.println();

		System.out.println("е) Удалить все ящики");
		box.clear();

		for (int i = 0; i < box.size(); i++) {
			System.out.println(box.get(i));
		}
		if(box.size() == 0) {
			System.out.println("Ящиков нет!");
		}
	}
}

//а) Создать динамический массив(ArrayList), содержащий объекты класса HeavyBox. 
//б) Раcпечатать его содержимое используя for each. 
//в) Изменить вес первого ящика на 1. 
//г) Удалить последний ящик. 
//д) Получить массив содержащий ящики из коллекции двумя способами и вывести на консоль. 
//е) Удалить все ящики.
